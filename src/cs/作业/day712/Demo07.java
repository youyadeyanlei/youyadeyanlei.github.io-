package cs.作业.day712;

public class Demo07 {
    public static void main(String[] args) {
        ClassC cc=new ClassC();
    }
}
class ClassA{
    public ClassA(){
        System.out.println("A");
    }
}
class ClassB{
    public ClassB(){
        System.out.println("B");
    }
}
class ClassC{
    ClassA a=new ClassA();
    ClassB b;
    public ClassC(){
        System.out.println("C");
    b=new ClassB();
    }
}