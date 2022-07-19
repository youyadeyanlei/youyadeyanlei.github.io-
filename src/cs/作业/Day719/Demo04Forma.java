package cs.作业.Day719;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04Forma {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        String time=sdf.format(date);
        System.out.println(time);
    }
}
