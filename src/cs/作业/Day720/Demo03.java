package cs.作业.Day720;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List接口的使用
 * 特点有序，有下标，可以重复
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建集合对象
        List list=new ArrayList<>();
        list.add("水果");
        list.add("苹果");
        list.add("小米");
        System.out.println(list.size());
        System.out.println(list.toString());

        list.remove("水果");
        System.out.println(list.size());
        System.out.println(list.toString());

        //
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for (Object o:list
             ) {
            System.out.println(o);
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator listIterator = list.listIterator();
        System.out.println("---------------");
        //从前往后
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex()+""+listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex()+""+ listIterator.previous());
        }

        //判断
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("小米"));

    }
}
