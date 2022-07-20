package cs.作业.Day720;

import java.util.ArrayList;
import java.util.List;

public class Demo07 {
    public  void xun() {
        while (true) {

        }
    }

    public static void main(String[] args) {
        List list = new ArrayList<>(80);
        //     System.out.println(list);
        for (int i = 1; i < 81; i++) {
            list.add(i);
        }
   //     System.out.println(list);

        int n = 1;
        int i = 1;
        while (list.size() > 2) {
            if (n == 3) {
                list.remove(i);
                n=0;
            }
            n++;
            i++;
        }
        System.out.println(list);

    }

}
