package Design.behavior;

/**
 * 饿汉式
 * 构造私有化
 */
public class Hungry {
    private  byte[] data1=new byte[1024*1024];
    private Hungry() {

    }
    private final static Hungry HUNGRY=new Hungry();
    private static Hungry getInstance(){
        return HUNGRY;
    }
}
