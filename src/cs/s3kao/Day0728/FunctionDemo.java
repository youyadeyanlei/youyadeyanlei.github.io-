package cs.s3kao.Day0728;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String,Integer> fn1= String::length;
        printlen("hello", fn1);
        List<String> list = new ArrayList<>();
        list.add("wawdwd");
        Consumer<String> c1=list::contains;
        Consumer<String> c2=System.out::println;
//        System.out.println(list);
        printlen1(c1);
//        printlen1(c2);

        printlen1(c2);

    }

    public static Consumer<String> printlen1(Consumer<String> s1){

        return s1;
       // System.out.println(s1);
    }
    public static void printlen(String msg, Function<String,Integer> fn){
        Integer integer = fn.apply(msg);
        System.out.println(integer);
    }




}
//interface MyFunction{
//    int len(String s);
//}
