package S1;

import java.util.Scanner;

public class Demosimulation {
    /*
    模拟用户注册信息功能，要求：控制台输入用户名、密码、邮箱、电话等信息

1. 用户名包含大小写字母和数字，长度6-12位，不允许其他非法字符，如果不符合抛出自定义异常。
2. 密码 password 包含大小写字母和数字,长度6-12位。不允许其他非法字符，如果不符合抛出自定义异常。
3. 邮箱按照实际规则校验，如果不符合抛出自定义异常。
4. 电话按照实际规则校验，如果不符合抛出自定义异常。
5. 如果都符合规范，则输出注册成功提示，否则注册失败。
     */
//    public static final String name ="[a-zA-Z0-9]{6,12}";
//    public static final String password = "([a-zA-Z0-9]){6,12}";
//
//    public static final String Mail="[1-9]\\d{7,10}@qq\\.com";    //qq邮箱
//    public static final String Telephone ="[0-9]{11}";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("输入姓名");
        user.setName(sc.nextLine());
        System.out.println("输入密码");
        user.setPassword(sc.nextLine());
        System.out.println("输入邮箱");
        user.setMail(sc.nextLine());
        System.out.println("输入电话");
        user.setTelephone(sc.nextLine());


    }

}
class User{
    public static final String name1 ="[a-zA-Z0-9]{6,12}";
    public static final String password1 = "([a-zA-Z0-9]){6,12}";

    public static final String Mail1="[1-9]\\d{7,10}@qq\\.com";    //邮箱
    public static final String Telephone1 ="[0-9]{11}";
    private String name;
    private String password;
    private String Mail;
    private String Telephone;

    public String getName() {
        return name;
    }

    public User() {
    }

    public void setName(String name) {

        try {
            //  System.out.println(name.matches(name1));
            if( name.matches(name1)==false){
                throw  new Exception("输入错误");
            }
            this.name = name;
        }catch (Exception e) {
            System.out.println("name错误");
            this.name = "错误";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            //  System.out.println(name.matches(name1));
            if( password.matches(password1)==false){
                throw  new Exception("输入错误");
            }
            this.password = password;
        }catch (Exception e) {
            System.out.println("密码错误");
            this.password = "错误";
        }
     //   this.password = password;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        try {
            //  System.out.println(name.matches(name1));
            if( Mail.matches(Mail1)==false){
                throw  new Exception("输入错误");
            }
            this.Mail = mail;
        }catch (Exception e) {
            System.out.println("邮箱错误");
            this.Mail = "错误";
        }
      //  Mail = mail;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        try {
            //  System.out.println(name.matches(name1));
            if( Telephone.matches(Telephone1)==false){
                throw  new Exception("输入错误");
            }
            this.Telephone = telephone;
        }catch (Exception e) {
            System.out.println("电话错误");
            this.Telephone = "错误";
        }
       // Telephone = String.valueOf(telephone);
    }

    public User(String naem, String password, String mail, String telephone) {
        this.name = naem;
        this.password = password;
        Mail = mail;
        Telephone = telephone;
    }
}
