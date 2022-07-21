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
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        for (int i = 1; i <4 ; i++) {
            if (i==3){
                list.remove(i-1);
            }
        }
        int n=1;int i=0;
        while (list.size()>2){

            if (n==3){
                list.remove(i-1);
            }

            n++;
        }
        System.out.println(list);
//        list.remove(2);
   //     System.out.println(list);

//        while (list.size() > 2) {
//        }
 //       System.out.println(list);

    }

}
