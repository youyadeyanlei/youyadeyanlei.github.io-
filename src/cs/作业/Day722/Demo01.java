package cs.作业.Day722;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("q");
        list.add("q1");
        list.add("11");
        list.remove("q");
        list.remove(0);
        printList(list);
        List<String> list1=new LinkedList<>();
        list1.add("s");
        list1.add("a");
        printList1(list1);
    }

    private static void printList1(List<String> list1) {
        for (String s: list1){
            System.out.println(s);
        }
    }

    private static void printList(List<String> list) {
        for(String s: list) {
            System.out.println(s);
        }
    }

//    private static void printList(List<String> list) {
//        System.out.println(Arrays.toString(new List[]{list}));
//    }
}
