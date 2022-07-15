package cs.作业.Day715;

public class Demo06 {

    public static void main(String[] args) {
        Super1 super1=new Sub1();
        super1.method(10);
        super1.method();
      //  super1.method("hello");
    }
}
class Super1{
    public void method(){
        System.out.println("super");
    }
    public void method(int i){
        System.out.println("super1");
    }

}
class Sub1 extends Super1{
    public void method(){
        System.out.println("sub1");
    }
    public void method(String str){
        System.out.println("string sub");
    }
}