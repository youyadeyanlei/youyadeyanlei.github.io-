package cs.作业.Day715;

public class Demo07 {
    public static void main(String[] args) {
        Sub sub= new Sub();
        sub.m1();
        sub.m2();
    }
}
class Super{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
}
class Sub extends Super{
public void m1(){
    System.out.println("m1Sub");
    super.m1();
}
}
