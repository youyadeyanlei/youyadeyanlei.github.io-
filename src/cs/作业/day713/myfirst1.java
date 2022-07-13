package cs.作业.day713;

class SuperClass {              //创建父类SuperClass
    private int n;            //声明一个私有变量n

    SuperClass() {             //父类无参数构造方法
        System.out.println("这是父类SuperClass无参数构造方法");
    }

    SuperClass(int n) {       //父类有参数构造方法
        System.out.println("这是父类SuperClass有参数构造方法");
        this.n = n;
    }
}

class SubClass extends SuperClass {     // SubClass类继承SuperClass类
    private int n;                       //声明一个私有变量n

    SubClass() {                          // 自动调用父类的无参数构造器
        System.out.println("这是子类无参数构造方法");
    }

    public SubClass(int n) {              //子类有参数构造方法
        super(300);                        //调用父类中带有参数的构造器
        System.out.println("这是子类有参数构造方法" + n);
        this.n = n;
    }
}

public class myfirst1 {
    public static void main(String[] args) {
        SubClass sc1 = new SubClass();      //创建子类SubClass实例对象，调用其无参数构造方法
        SubClass sc2 = new SubClass(100);   //创建子类SubClass实例对象，调用其有参数构造方法
    }
}