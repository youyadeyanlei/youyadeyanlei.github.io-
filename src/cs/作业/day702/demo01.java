package cs.作业.day702;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner01=new Scanner(System.in);
        System.out.println("输入第一个数");
        int s1=scanner01.nextInt();
        System.out.println("输入第二个数");
        int s2=scanner01.nextInt();
        int n=0;
        System.out.println("输入1.代表+    2.代表-   3.代表*   4.代表/");
        int s3=scanner01.nextInt();
        switch (s3){
            case 1:n=s1+s2;break;
            case 2:n=s1-s2;break;
            case 3:n=s1*s2;break;
            case 4:n=s1/s2;break;
        }
        System.out.println(n);

    }
}
