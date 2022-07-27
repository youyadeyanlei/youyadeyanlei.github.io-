package cs.s3kao.Day0726.anlie;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        Clark clark = new Clark();
        shop shop = new shop(clark);
        shop shop1 = new shop(clark);
        client client = new client(clark);
        client client1 = new client(clark);
        shop.setName("生产者号1：");
        shop1.setName("生产者号2：");
        client.setName("消费者1：");
        client1.setName("消费者2：");
        shop1.start();
        shop.start();
        client.start();
        client1.start();
    }
}
