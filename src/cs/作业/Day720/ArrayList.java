package cs.作业.Day720;

import java.util.AbstractList;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        AbstractList arrayList = new java.util.ArrayList();
        //1.添加
        Student1 s1 = new Student1("a", 18);
        Student1 s2 = new Student1("c", 20);
        Student1 s3 = new Student1("b", 19);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        //删除
        //  arrayList.remove(s1);
        // arrayList.remove(new Student1("a",18));
        System.out.println(arrayList.size());
        //遍历
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Student1 student1 = (Student1) it.next();
            System.out.println(student1.toString());
        }




    }
}
