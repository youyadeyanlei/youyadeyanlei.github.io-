package cs.s3kao.s3;

public class Demo02 {

        // name长度不少于8位且至少包含大写字母、小写字母、数字和特殊符号中的四种"[a-zA-Z0-9]{8,}"
        public static final String name ="[a-zA-Z0-9]{8,}";
        // 密码长度8-20位且至少包含大写字母、小写字母、数字或特殊符号中的任意三种
        public static final String password = "([a-zA-Z0-9+$]){8,}";

        public static final String IDCard ="[0-9+x]{18}";

        public static void main(String[] args) {



            String password1 = "A1111111111111111";
            String password2 = "abcdefghig$";  //全部小写
            String password3 = "123456789123456789";  //全部数字

            System.out.println(password3.matches(IDCard));
            String password9 = "abcde!@#$%";  //小写字母和特殊字符
            String password10 = "01234!@#$%"; //数字和特殊字符
            String password11 = "Aa4!";       //长度不够8位数
            String password12 = "ABCDE01234!@#$%"; //符合要求密码任意三种
            String password13 = "ABCDEabcde!@#$%"; //符合要求密码任意三种
            String password14 = "ABCDEabcde01234"; //符合要求密码任意三种
            String password15 = "abcde01234!@#$%"; //符合要求密码任意三种
            String password16= "ABCabc012@#"; //符合要求密码任意三种 和 符合全部的四种

            System.out.println(password1.matches(name)+"1");
            System.out.println(password2.matches(password)+"22");
//            System.out.println(password1.matches(password) + " 1");
//            System.out.println(password2.matches(password)+ " 2");
//            System.out.println(password3.matches(password)+ " 3");
//
//            System.out.println(password9.matches(password)+ " 9");
//            System.out.println(password10.matches(password)+ " 10");
//            System.out.println(password11.matches(password)+ " 11");
//            System.out.println(password12.matches(password)+ " 12");
//            System.out.println(password13.matches(password)+ " 13");
//            System.out.println(password14.matches(password)+ " 14");
//            System.out.println(password15.matches(password)+ " 15");
//            System.out.println(password16.matches(password)+ " 16");
        }
    }

