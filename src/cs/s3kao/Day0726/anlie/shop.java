package cs.s3kao.Day0726.anlie;

/**
 * 商店,生产者
 */
public class shop extends Thread {
    private Clark clark;

    public shop(Clark clark) {
        this.clark = clark;
    }

    public void run() {
        //不断生产产品
        while (true) {
            synchronized (clark) {
                clark.addProduct();
            }
        }
    }
}
