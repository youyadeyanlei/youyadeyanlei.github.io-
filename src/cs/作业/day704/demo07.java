package cs.作业.day704;

import java.util.Random;

public class demo07 {
    public static void main(String[] args) {

//        chfa();
//        zheng();
    //san();
        sss();
    }
    public static void chfa(){
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"x"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public static void zheng(){
        Random random=new Random();
        int a=random.nextInt(5)+5;
        System.out.println("随机数"+a);
        for (int i =a-3; i <a; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void san(){
        for (int i = 0; i < 5; i++) {
            for (int j =0; j <i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void sss(){
        int row =5;
        int column=1;
        for (int i = 1; i <row ; i++) {

            for (int j = row; i<j ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
