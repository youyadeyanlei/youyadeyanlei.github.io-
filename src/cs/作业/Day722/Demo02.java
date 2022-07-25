package cs.作业.Day722;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Set<String> set =new HashSet<>();
        list.add("a");
        list.add("b");
        list.add("a");

set.addAll(list);
        System.out.println(set);
        System.out.println(set.size());
//        System.out.println(Arrays.toString());
    for (String s: set){
        System.out.println(s);
    }
    }
}
