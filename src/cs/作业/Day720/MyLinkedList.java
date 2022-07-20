package cs.作业.Day720;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add(1,"dddd");
        System.out.println(list);

        list.addFirst("EEE");
        list.addLast("FFF");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.getLast()+list.getFirst());

        list.push("aaa");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.poll());

    }
}
