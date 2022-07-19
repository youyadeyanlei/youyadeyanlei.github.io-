package cs.作业.Day720;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        Student1 student1=new Student1("张三",12);

        Student1 student2=new Student1("李四",18);

        Student1 student3=new Student1("张yal ",13);

        Student1 student4=new Student1("qikun",18);

        Student1 student5=new Student1("张三",12);

        collection.add(student1);
        collection.add(student2);
        collection.add(student3);
        collection.add(student4);
        collection.remove(student1);
        System.out.println(collection.size());
        System.out.println(collection.toString());
        for (Object o:collection
             ) {
            Student1 student11=(Student1)o;
            System.out.println(student11.toString());
        }

        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            Student1 student11=(Student1) iterator.next();
            System.out.println(student11.toString());
        }

    }

}
