package cs.作业.Day716;

public class Demo05 {
    public static void main(String[] args) {
        Test05 a=new Test05();
        a.m2();
        a.m1();
        A a1=new A();
        a1.m1();
        a1.m2();
        Test05.m1();
    }
}
class Test05{
    public static void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
}
class A extends Test05{
    public static void m1(){
        System.out.println("A1");
    }
    public void m2(){
        System.out.println("A2");
    }
}