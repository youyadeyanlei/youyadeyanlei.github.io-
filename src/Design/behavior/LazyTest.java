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
