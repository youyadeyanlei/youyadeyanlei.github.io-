package cs.作业.biao;

import java.util.Random;

/**
 * 工具类
 */
public class RandomUtils {
    //提供随机姓名
    private final static String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    //创建随机对象
    private static final Random random = new Random();
    //随机性别
    private static final String[] genders = {"male", "femle"};

    /**
     * 生成随机名字
     */
    public static String randomString(int len) {//传入长度
        //toCharArray()方法将字符串转换为字符数组。
        char[] chars = data.toCharArray();
        //创建一个临时存放数组
        char[] temp = new char[len];
        for (int i = 0; i < len; i++) {
            //random.nextInt(data.length())随机生成一个[0,dato.lenth)的数字
            temp[i] = chars[random.nextInt(data.length())];//将随机的数字对应的数组赋值给临时数组
        }
        //String() 函数把对象的值转换为字符串。
        return new String(temp);//不使用字符串的拼串是因为会产生大量的内存零时垃圾
    }

    /**
     * 当用户满意输入数据，给一个默认长度
     *
     * @return len长度为5
     */
    public static String randomString() {
        return randomString(5);
    }

    /**
     * min 年龄最小值
     * max 年龄最大值
     */
    public static int randomNumber(int min, int max) {
        if (max < min) {
            System.out.printf("%d 不能比 %d 小\r\n", max, min);
        }
        //返回随机数的范围在min--max
        return random.nextInt(max - min) + min;
    }
    /**
     * 如果用户只输入了一个值
     */
    public static int randomNumber( int max) {
        return randomNumber(1,max);//给一个默认值
    }

    /**
     * 随机性别
     * @return 性别
     */
    public static String randomGender(){
        //将随机数0位男，1为女
        return genders[random.nextInt(2)];
    }

    public static void longSleep() {
    }

    public static void longSleep(int min, int max) {
        int time = randomNumber(min, max);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
