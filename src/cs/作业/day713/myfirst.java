package cs.作业.day713;

class A {
    public void sayHello() {                      //输出英文欢迎
        System.out.println("Hello,Welcome to Java!!!");
    }

    public void sayBye() {
        System.out.println("GoodBye,everyone");
    }
}

class B extends A {
    public void sayHello() {                      //输出中文欢迎
        System.out.println("大家好，欢迎学习Java！！！");
    }
}

public class myfirst {
    public static void main(String[] args) {
        B b = new B();                                //创建子类B的一个实例对象，使用默认构造方法
        b.sayHello();                               //调用子类中重写的方法
        b.sayBye();                                 //调用父类中的方法
    }
}