package cs.作业.day704;

import java.util.Random;

public class demo06 {
    public static void main(String[] args) {

        zheng();
    }
    public static void zheng(){
        Random random=new Random();
        int a=random.nextInt(10)+1;
        System.out.println("随机数"+a);
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
