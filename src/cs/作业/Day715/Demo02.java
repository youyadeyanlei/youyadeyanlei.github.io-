package cs.作业.Day715;

public class Demo02 {
    public static void main(String[] args) {

        People people=new Worker("1");
        People people1=new Boss("a");
        run(people);
        run(people1);
    }
    public static void run(People people){
        people.work();
    }
}

class Worker extends People{


    public Worker(String name) {
        super.setName(name);
    }

    public  void work(){
        System.out.println(getName()+"工作");
    }

}
class Boss extends People{

    public Boss(String name) {
        super.setName(name);
    }

    public  void work(){
        System.out.println(getName()+"工作");
    }
}
class People{
    private String name;

    People() {
    }

    public  void work(){}

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}