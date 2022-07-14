package cs.作业.day712;

public class Demo08 {
    int value;
    public static void main(String[] args) {
        int value=10;
        changelnt(value);
        System.out.println(value);
        Demo08 ca= new Demo08();
        ca.value=10;
        changeObject(ca);
        System.out.println(ca.value);
    }
//    class ClassA{
//        int value;
//    }
    public static void changelnt(int value){
        value++;
    }
    public static void changeObject(Demo08 ca){
        ca.value++;
    }
}
