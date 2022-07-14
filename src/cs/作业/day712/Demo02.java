package cs.作业.day712;

public class Demo02 {

    public static void main(String[] args) {
        Demo02 demo02=new Demo02();
        demo02.method();
        demo02.method(10);
    }

     void method() {
         System.out.println("method");
    }
    int method(int i){
        System.out.println("method(int)");
        return i;
    }
}
