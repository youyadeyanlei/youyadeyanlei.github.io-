package cs.作业.day712;

public class Demo04 {
    int value;

    public static void main(String[] args) {
        int a=10;
        int b=a;
        b++;
        System.out.println(a);
        Demo04 demo04=new Demo04();
        demo04.value=10;
        Demo04 demo041=demo04;
        demo041.value++;
        System.out.println(demo04.value);
    }
}
