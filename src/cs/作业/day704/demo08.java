package cs.作业.day704;

public class demo08 {

    public static void main(String[] args) {
        tu();
    }
    public static void tu(){
        int tu1=2;
        int yue=20;
        int sum=0;
        for (int i = 0; i <=yue ; i+=3) {
            tu1*=2;
        }
        System.out.println(tu1);
    }
}
