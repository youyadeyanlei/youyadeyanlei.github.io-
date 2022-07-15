package cs.作业.Day715;

public class Demo08 {
    public static void main(String[] args) {
        Sub2 sub2=new Sub2();
        Sup sup=new Sup();
        Test1.foo(sub2);
        Test1.foo(sup);
    }
}
class Sup{
    public void m(){
        System.out.println("sup");
    }
}
class Sub2 extends Sup{
    public void m(){
        System.out.println("sub");
    }
}
class Test1{
    public static void foo(Sup s){
        s.m();
    }
    private int a;
    public int b(){
        return a;
    }
}