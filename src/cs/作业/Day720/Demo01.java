package cs.作业.Day720;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1.添加元素
 * 2.删除元素
 * 3.遍历元素
 * 4.判断
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("西瓜");
        collection.add("葡萄");
        collection.add("苹果");
        System.out.println(collection.size());
        System.out.println(collection);

        collection.remove("葡萄");
//        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection);

        for (Object object:collection     ) {
            System.out.println(object);
        }
        collection.iterator();
        System.out.println(collection.size());

        Iterator it =collection.iterator();
        while ((it.hasNext())){
            String o= (String) it.next();
            System.out.println(o);
          //  it.remove();
        }

        System.out.println(collection.size());

        System.out.println(collection.contains("西瓜"));
        System.out.println(collection.size());


    }
}
