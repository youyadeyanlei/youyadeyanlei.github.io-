package cs.作业.Day719;

import java.util.Calendar;

public class Demo05 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        //设置时间
        calendar.set(2022,7,19);
        int workDay=calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        for (int i = 0; i < workDay; i++) {
            System.out.println("\t");
        }
        //获取当前月份
        int month =calendar.get(Calendar.MONTH);
        while (month==7){
            int day =calendar.get(Calendar.DATE);
            System.out.println(day);
            workDay =calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
            if (workDay==Calendar.SATURDAY){
                System.out.println();
            }
            calendar.add(Calendar.DATE,1);
            month=calendar.get(Calendar.MONTH);
        }

    }
}
