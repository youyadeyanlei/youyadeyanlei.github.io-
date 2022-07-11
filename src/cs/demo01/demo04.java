package cs.demo01;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        int i = scanner.nextInt();
        System.out.println(i);

        int i1 =scanner.nextInt();
        int i2 =scanner.nextInt();
        if (i>i1)
        {
            if (i>i2){
                System.out.println(i);
            }else System.out.println(i2);
        } else if (i1>i2) {
            System.out.println(i1);

        }else System.out.println(i2);

    }
}
