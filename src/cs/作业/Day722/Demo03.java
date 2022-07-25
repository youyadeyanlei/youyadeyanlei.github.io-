package cs.作业.Day722;

import java.util.*;

public class Demo03 {
    public static void main(String[] args) {
        List<Worker> list =new ArrayList<Worker>();


        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));

        list.add(1,new Worker("zhao6",24,3300));
     //   list.remove(3);

        HashSet<Worker> hashSet= new HashSet<Worker>();

        hashSet.addAll(list);

        Iterator<Worker> it =hashSet.iterator();
        while (it.hasNext()) {
            Worker str = it.next();
            System.out.println(str.getName());
        }
//        for (Worker worker : list) {
//            System.out.println(list);
//        }

    }
}
