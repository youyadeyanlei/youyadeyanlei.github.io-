package cs.s3kao.Day0726.p1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者
 */
public class Producer extends Thread{
    private  Shop shop;
//private Lock lock=new ReentrantLock();

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (shop) {
                shop.addShelves();
            }
//            lock.lock();
//            try {
//                shop.addShelves();
//            }finally {
//                lock.unlock();
//            }


        }
    }
}
