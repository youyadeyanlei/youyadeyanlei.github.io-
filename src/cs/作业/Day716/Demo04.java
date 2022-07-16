package cs.作业.Day716;

public class Demo04 {
    public static void main(String[] args) {
        Test03 q=new Test03();
        System.out.println(q.i);
        Test03 q1=new Test03(10);
        System.out.println(q1.i);
    }
}
class Test03{
    static int i=10;
    {
        System.out.println(i);
        i=20;
        System.out.println("a");
    }

    public Test03(int i) {
        System.out.println("v");
    this.i=i;
    }

    public Test03() {
        System.out.println("b");
    }
}