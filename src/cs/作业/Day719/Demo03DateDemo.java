package cs.作业.Day719;

import java.util.Date;

public class Demo03DateDemo {
    public static void main(String[] args) {
        //创建一个Date类的对象，显示系统时间
        Date date = new Date();
        System.out.println(date);
        //year 年份  month月份  date 日期
        Date date1=new Date(2000-2023,1,18);
        System.out.println(date1);
        Date date2=new Date();
        System.out.println(date2.getTime()/1000/60/60/24/365);

    }
}
