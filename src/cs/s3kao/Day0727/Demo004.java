package cs.s3kao.Day0727;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo004 {
    //消费型接口 Consumer<T> void accept(T t)
    public static void consumer(double money, Consumer<Double> con) {
        con.accept(money);
    }

    //供给型接口 Supplier<T> T get()
    public static String supplier(Supplier<String> sup) {
        return sup.get();
    }

    //函数型接口 Function<T,R> R apply(T t)
    public static String function(Integer id, Function<Integer, String> fun) {
        return fun.apply(id);
    }

    //断定型接口 Predicate<T> boolean test(T t)
//根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public static List<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }

    public static void main(String[] args) {
        consumer(400, money -> System.out.println("价格为：" + money));
        System.out.println(supplier(() -> "你好！"));
        System.out.println(function(1001, id -> "我的编号是：" + id));
        System.out.println(filterString(Arrays.asList("北京", "南京", "天津"), s -> s.contains("京")));
    }
}
