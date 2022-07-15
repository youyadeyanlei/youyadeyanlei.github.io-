package cs.作业.Day715;

public class Demo03 {
    public static void main(String[] args) {
        people a=new SoftwareEngineer();
        Stage stage=new Stage(a);
        stage.run();
    }
}
class Stage{
    private people p;

    public Stage(people p) {
        this.p = p;
    }
    public  void run(){
        p.employ();
    }
}
abstract class people{
    String name;

    abstract void employ();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//软件工程师
class SoftwareEngineer extends people{

    @Override
    void employ() {
        super.setName("软件工程师");
        System.out.println(getName());
    }
}
//工人
class worker extends  people{


    @Override
    void employ() {
        super.setName("工人");
        System.out.println(getName());
    }
}
//农民
class Farmer extends  people{

    @Override
    void employ() {
        super.setName("农民");
        System.out.println(getName());
    }
}