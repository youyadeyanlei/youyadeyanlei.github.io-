package cs.作业.day704;

import java.util.Random;
import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        Random random =new Random();
        Scanner scanner =new Scanner(System.in);


        int a =random.nextInt(100)+1;
       while (true){
           System.out.println("shur");
           int b=scanner.nextInt();
           if (a==b){
               System.out.println("猜对了");
               break;
           }
           if (a>b){
               System.out.println("输入小了");
           }
           if (a<b){
               System.out.println("大 l ");
           }
       }

    }
}
