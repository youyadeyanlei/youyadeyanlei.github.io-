package cs.作业.day714;

public class Demo01 {

    public static void main(String[] args) {
        Sub s1=new Sub();
        Sub s2=new Sub(10);
        Sub s3=new Sub("hello");
    }

}
class Super{
    public Super(){
        System.out.println("Super()");
    }
    public Super(int i){
        System.out.println("super");
    }
    public Super(String str){
        System.out.println("Super(String)");
    }
}
class Sub extends Super{
    public Sub(){
        System.out.println("Sub()");
    }
    public Sub(int i){
        this();
        System.out.println("Sub(int)");
    }
    public Sub(String str){
        super(str);
        System.out.println("Sub()");
    }
}