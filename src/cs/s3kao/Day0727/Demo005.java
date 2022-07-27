package cs.s3kao.Day0727;

public class Demo005 {
    //自定义函数式接口
    @FunctionalInterface
    public interface MyInterface1 {
        void method1();
    }

    //函数式接口中使用泛型
    @FunctionalInterface
    public interface MyInterface2<T> {
        T getValue(T t);
    }

    public static void main(String[] args) {
        MyInterface1 func1 = () -> System.out.println("自定义函数式接口");
        func1.method1();
        MyInterface2<String> func2 = s -> "你好："+s;
        func2.getValue("小明");
    }
}
