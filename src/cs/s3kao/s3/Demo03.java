package cs.s3kao.s3;

import java.util.Scanner;

public class Demo03 {
    public static final String name ="[a-zA-Z0-9]{8,}";

    public static final String password = "([a-zA-Z0-9+$]){8,}";

    public static final String IDCard ="[0-9+x]{18}";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();
        System.out.println("输入name，大小写，至少8位");
        user.setName(input.nextLine());
        System.out.println(user.getName());
        System.out.println("输入密码，大小写，至少8位");
        user.setPassword(input.nextLine());
        System.out.println(user.getPassword());

    }
}
