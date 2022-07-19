package cs.作业.Day719;

public class Demo02 {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "c";
        String s3 = new String("abc");
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ab" + "c";
        String str4 = s1 + s2;
        String str5 = new String("abc");
        String str6 = new String("ab") + "c";
        String str7 = s3.intern();
/**
 * String str1 = "abc";
 * String str2 = "abc";
 * 这个“abc”存放在常量池中，
 * 常量池的特点：
 * ⾸先会去常量池中找是否有“abc”这个常量字符串，如果有直接⽤str1指向它，
 * 如果没有将“abc”放到常量池中，⽤str1指向它
 * 再使⽤去常量池中找有没有“abc”,这个时候已经有了，直接使⽤str2指向它。
 */
        System.out.println(str1 == str2);//true
/**
 * String str3 = "ab" +"c";
 * 因为“ab”是常量与“c”拼接之后也会在常量池中。
 */
        System.out.println(str1 == str3);//true
/**
 * String s1 = "ab";
 * String s2 = "c";
 * 当s1和s2拼接的时候，jdk会将s1和s2转换成StringBuilder类型，然后进⾏拼接操作，
 * 最终的内容实在堆内存中。
 */
        System.out.println(str1 == str4);//false
/**
 * String str1 = "abc"; 在常量池
 * String str5 = new String("abc"); 在堆内存
 */
        System.out.println(str1 == str5);//false
/**
 * String str5 = new String("abc"); 在堆内存
 * String str6 = new String("ab")+"c";在堆内存
 */
        System.out.println(str5 == str6);//false
/**
 * String str1 = "abc"; 在常量池
 * String str6 = new String("ab")+"c"; 在堆内存
 */
        System.out.println(str1 == str6);//fals
        /**
         * String str7 = s3.intern();
         * intern⽅法的含义：将String类型的对象指向常量池，如果有直接指向，如果没有放⼀个指向
         */
        System.out.println(str1 == str7);//true
    }
}