package cs.作业.Day718.lS;

public class Demo01 {

    public static void main(String[] args) {
        A1 a1=new MyClass1();
        a1.m1();
        System.out.println(A1.a);
    }
}
interface A1{
    void  m1();
    int a=100;
}
class  MyClass1 implements A1{
   public void m1(){}
}