package cs.作业.Day720;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(20);
        //自动装箱
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("+++"+list.size());
        System.out.println(list.toString());

        //list.remove("20");
     //   list.remove((Object) 20);
   //     list.remove(new Integer(30));
        System.out.println(list.toString());
//sublist
        List subList = list.subList(1, 3);
        System.out.println(subList.toString());


    }
}
