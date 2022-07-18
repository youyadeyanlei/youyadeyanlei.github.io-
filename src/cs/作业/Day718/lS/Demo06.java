package cs.作业.Day718.lS;

public class Demo06 {
    public static void main(String[] args) {
        Teach teach=School.getTeach(0);
        teach.teach();
        Teach teach1=School.getTeach(10);
 teach1.teach();
    }
}
interface Teach{
    void teach();
}
class TeachA implements Teach{

    @Override
    public void teach() {
        System.out.println("a");
    }
}
class  TeachB implements Teach{

    @Override
    public void teach() {
        System.out.println("B");
    }
}
class School{
    public static Teach getTeach(int a){
        if (a==0)return  new TeachA();
        else return new TeachB();
    }
}
