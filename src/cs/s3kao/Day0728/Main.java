package cs.s3kao.Day0728;

import cs.s3kao.s3.User;
import cs.作业.biao.RandomUtils;
import jdk.internal.org.objectweb.asm.util.Printer;


import java.io.PrintStream;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
//        public static void main(String[] args) {
//            greet(new Printer() {
//                @Override
//                public void print(String msg) {
//                    System.out.println(msg);
//                }
//            });
//        }
//
//        public static void greet(Printer printer){
//            printer.print("Hello world");
//        }

//        greet(msg -> {
//            System.out.println(msg);
//        });
        //     greet((msg)-> System.out.println(msg));
        // 情况一：对象 :: 实例方法
        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("beijing");

// 情况二：类 :: 静态方法
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12, 3));

// 情况三：类 :: 实例方法  (有难度)
//注意：当函数式接口方法的第一个参数是需要引用方法的调用者，
//并且第二个参数是需要引用方法的参数(或无参数)时：ClassName::methodName
// String中的 int t1.compareTo(t2)
        Comparator<String> com3 = String::compareTo;
        System.out.println(com3.compare("abd", "abm"));

//BiPredicate中的boolean test(T t1, T t2);
//String中的boolean t1.equals(t2)
        BiPredicate<String, String> pre2 = String::equals;
        System.out.println(pre2.test("abc", "abd"));
        greet(msg -> System.out.println(msg));
        Printer1 printer = msg -> System.out.println(msg);
    }

    public static void greet(Printer1 printer) {
        printer.print("Hello world");

    }
}

interface Printer1 {
    void print(String msg);
}

class ConsolePrinter implements Printer1 {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}

class LambdasDemo {
    public static void main(String[] args) {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer1 printer) {
        printer.print("Hello world");
    }
}




