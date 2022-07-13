package cs.作业.day713;

public class Demo06 {
    String name;
    int age;

    //   this.name是调用成员变量，（String name）是局部变量
    public Demo06(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void test01() {
        System.out.println("执行test01");
    }

    public void test02() {
        test01();//this调用成员方法
    }

    public Demo06() {
        System.out.println("无参构造");
    }

    public Demo06(String name) {
        this();
        this.name = name;//有参构造

//        只能在构造方法中使用this()调用其他的构造方法，不能在成员方法中使用。
//        在构造方法中使用this()调用构造方法的语句必须位于第一行，而且只能出现一次。
//        不能在一个类中的两个构造方法中使用this()互相调用
    }

}
