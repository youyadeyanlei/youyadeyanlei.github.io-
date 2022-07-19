package cs.作业.Day719;

import java.text.SimpleDateFormat;

public class Demo06 {

    public static void main(String[] args) {
//System 系统类
//获取系统当前时间，返回⾃1970年开始以来时间的毫秒数
        System.out.println(System.currentTimeMillis());
//格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(System.currentTimeMillis());
        System.out.println(time);
//结束当前虚拟机运⾏ 0表⽰正常退出
        System.exit(0);
        System.out.println("执⾏吗？");
    }
}