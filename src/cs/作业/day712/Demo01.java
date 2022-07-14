package cs.作业.day712;

public class Demo01 {
    int value;
    public void method(int value){
        System.out.println(value);
    }
    public void method(){
        System.out.println(value);
    }
}
class TestA{
    public static void main(String[] args) {
        Demo01 demo01=new Demo01();
        demo01.value=10;
        demo01.method();
        demo01.method(20);
    }
}