package cs.demo01;

import java.util.Scanner;

public class dmeo02 {
    public static void main(String[] args) {
        System.out.println("java是一门跨平台的计算机语言");
        System.out.println("第一次编写运行");

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入姓名");
        String naem =scanner.nextLine();
        System.out.println(naem);
        System.out.println("输入性别");
        String six=scanner.nextLine();
        System.out.println(six);
        System.out.println("年龄");
        String age=scanner.nextLine();
        System.out.println(age);
        System.out.println("身高多少米");
        String s1 =scanner.nextLine();

        System.out.println(s1);
        System.out.println("是否婚配，1是，2否");
        int s2 =scanner.nextInt();
        if (s2==1){
            System.out.println("trun");
        }else if (s2==2){
            System.out.println("false");
        }else System.out.println("输入错误");




    }
}
