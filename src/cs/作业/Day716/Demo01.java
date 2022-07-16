package cs.作业.Day716;

public class Demo01 {
    public static void main(String[] args) {
        MyClass01 a=new MyClass01();
        MyClass01 b=new MyClass01();
        a.a=100;
        a.b=200;
        b.a=300;
        b.b=400;
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(b.a);
        System.out.println(b.b);
    }
}
class MyClass01 {
    static int a;
    int b;
}