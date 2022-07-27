package cs.s3kao.Day0727;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo002 {
    //匿名内部类
    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello World!");
        }
    };

    Runnable r3 =()-> {
        System.out.println();

    };
    //Lambda表达式
    Runnable r2 = () -> System.out.println("Hello World!");
    //原来使用匿名内部类作为参数传递
    TreeSet<Integer> ts1 = new TreeSet<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    });

    //Lambda 表达式作为参数传递
    TreeSet<Integer> ts2 = new TreeSet<Integer>(
            (o1, o2) -> Integer.compare(o1, o2)
    );



}
