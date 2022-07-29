# 每日一题

## 1.面向对象有哪些特征

首先面向对象是运用了类与对象编程的思想，及是万物皆可对象。

类是对事物的高度抽象，不同是事物之间有不同的关系，

及一个类与对外的封装关系

一个父类与子类的继承关系，

一个类与多个类的 多态关系。

对象是具体的事物，面向对象的三大特性，封装，继承，多态

封装是对一个类行为和属性，与其他类的关系进行封装，目的低耦合，高内聚

继承是父类与子类的关系。

多态是类与类的关系。及一个类在不同的情况下完成不同的结果，

封装隐藏了类的内部实现机制，可以在不影响使用的情况下改变类的内部结构，同时也保护了数据。对外界，它的内部是不可见的，暴露给外部的是它设定好的访问方法：

属性的封装，使用者只能通过事先制定好的方法来访问数据。

方法的封装：使用者通过规定的方式调用方法，不必关心内部的实现，增强了维护性。

继承是从已经有的类中派生出的新类，与原有的类有关系，能吸收已继承类的数据属性和行为，并且扩展出新的能力。在本质上是特殊的关系，子类继承父类，子类可以具有父类没有的方法，java中用extends关键字来实现继承，private定义的变量和方法，为私有的，不会被继承，

多态，是指类与类的关系，两个类的继承关系，存在方法的重写，可以在调用时有父类引用指向子类对象。多态的三个要素，继承，重写，父类引用指向子类对象

## 2.java接口和抽象类有哪些区别

抽象类描述的是一个概率，比如狗是动物，你不能说狗接口动物。

接口描述的是一种共同拥有的特征，比如鸟会飞

相同点：

1.不能被实列化

2.可以将抽象类和接口类型作为引用类型

3.一个类如果继承了某个抽象类或者实现了某个接口，都需要对其中的抽象方法进行全部实现，否则任然需要被什么成为抽象类

不同点：

抽象类：

1.抽象类可以定义构造器

2.可以有抽象方法和具体方法

3.接口中的成员全是public的

4.抽象类中可以定义成员变量

5.有抽象方法的类必须声明为抽象类，抽象类未必有抽象方法

6抽象类可以包含静态方法

7.一个类只能继承一个抽象类

接口：

1.接口中不能定义构造器

2.方法全部都是抽象方法

3.抽象类中的成员可以是private、默认、protected、public

4.接口中的定义的成员变量实际上都是常量

5.接口中不能有静态方法

6.一个类可以实现多个接口

## 3.计算机组成+cpu结构



## 4.对象的创建过程

1.先分配内存空间

2.javanew出来的空间基本数据类型默认为0，引用类型是null，booleam默认是float 

3.然后赋值，然后建立关系

首先分配空间赋默认值，调用构造方法赋初始值，建立关联





## DCl单例模式中volatile关键字的作用

首先单列模式分，懒汉式和饿汉式

懒汉式中要进行双重检查锁，

还要加volatile关键字，

还是能被反射影响，

可以采用枚举。



在java内存模型中，volatile 关键字作用可以是保证可见性或者禁止指令重排。这里是因为 singleton = new Singleton() ，它并非是一个原子操作，事实上，在 JVM 中上述语句至少做了以下这 3 件事：

第一步是给 singleton 分配内存空间；

第二步开始调用 Singleton 的构造函数等，来初始化 singleton；

第三步，将 singleton 对象指向分配的内存空间（执行完这步 singleton 就不是 null 了）。

这里需要留意一下 1-2-3 的顺序，因为存在指令重排序的优化，也就是说第 2 步和第 3 步的顺序是不能保证的，最终的执行顺序，可能是 1-2-3，也有可能是 1-3-2。

如果是 1-3-2，那么在第 3 步执行完以后，singleton 就不是 null 了，可是这时第 2 步并没有执行，singleton 对象未完成初始化，它的属性的值可能不是我们所预期的值。假设此时线程 2 进入 getInstance 方法，由于 singleton 已经不是 null 了，所以会通过第一重检查并直接返回，但其实这时的 singleton 并没有完成初始化，所以使用这个实例的时候会报错



使用了 volatile 之后，相当于是表明了该字段的更新可能是在其他线程中发生的，因此应确保在读取另一个线程写入的值时，可以顺利执行接下来所需的操作。在 JDK 5 以及后续版本所使用的 JMM 中，在使用了 volatile 后，会一定程度禁止相关语句的重排序，从而避免了上述由于重排序所导致的读取到不完整对象的问题的发生。


```java
package Design.behavior;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式
 */
public class LazyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//有反射就不安全
        LazySing lazySing = LazySing.getInstance();
        Constructor<LazySing> declaredConstructor = LazySing.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);//无视私有
        LazySing instance = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(lazySing);


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazySing.getInstance();
            }).start();
        }
    }
}

class LazySing {
    //必须加volatile
    private static boolean key = false;
    public volatile static LazySing instance;

    //私有的构造函数，防止从外部new
    private LazySing() {
        System.out.println(Thread.currentThread().getName() + "ok");
        //防止反射
        synchronized ((LazySing.class)) {
            if (key == false) {
                key = true;
            } else {
                throw new RuntimeException("异常");
            }
        }
    }

    //防止多次实例化
    public static LazySing getInstance() {
//双重检查锁 DCL懒汉式,

        if (instance == null) {
            synchronized (LazySing.class) {
                if (instance == null) {
                    instance = new LazySing();
//加volatile
                }
            }
        }
        return instance;
    }
}
```





