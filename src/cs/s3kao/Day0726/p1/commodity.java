package cs.s3kao.Day0726.p1;

/**
 * 商品commodity
 */
public class commodity {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Producer p1 = new Producer(shop);
        Producer p2 = new Producer(shop);
        Consumer c1 = new Consumer(shop);
        Consumer c2 = new Consumer(shop);
        p1.setName("生产者1");
        p2.setName("生产者2");
        c1.setName("消费者1");
        c2.setName("消费者2");
        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }


}
