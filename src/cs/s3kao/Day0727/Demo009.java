package cs.s3kao.Day0727;

import java.util.Comparator;
import java.util.function.Consumer;

public class Demo009 {
    public static void main(String[] args) {
        //语法格式一：无参，无返回值
        Runnable r2 = () -> System.out.println("Hello World!");
        r2.run();

//语法格式二：Lambda 需要一个参数，但是没有返回值。
        Consumer<String> con1 = (String s) -> System.out.println(s);
        con1.accept("世上无难事，只怕有心人！");

//语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
        Consumer<String> con2 = (s) -> System.out.println(s);
        con2.accept("世上无难事，只怕有心人！");

//语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
        Consumer<String> con3 = s -> System.out.println(s);
        con3.accept("世上无难事，只怕有心人！");

//语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12, 6));

//语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
        Comparator<Integer> com3 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com3.compare(12, 21));
    }
}
