package cs.作业.day704;

public class demo01 {

    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i=i+2) {
            System.out.println(i);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        int b=0;
        for (int i = 0; i <=10000 ; i=i+400) {
            System.out.println("quan"+i);


            System.out.println("多少圈"+b);
            b++;
        }



    }
}
