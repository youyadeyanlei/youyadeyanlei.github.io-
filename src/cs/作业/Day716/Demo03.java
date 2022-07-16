package cs.作业.Day716;

public class Demo03 {
    public static void main(String[] args) {
        Test02 a=new Test02();
        Test02 b=new Test02();
        Test02 c=new Test02();
    }
}
class Test02{
    static int c=0;

    public Test02() {
        c++;
        System.out.println(c);
    }
}