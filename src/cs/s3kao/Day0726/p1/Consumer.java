package cs.s3kao.Day0726.p1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 消费者
 */
public class Consumer extends Thread{
    private Shop shop;
//    private Lock lock=new ReentrantLock();
    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        boolean flag=true;
        while (flag) {
            if (shop.getAddtotal()==100) {

                System.out.println(shop.getAddtotal());
                flag = false;
            }
           synchronized (shop){
               shop.desShelves();
           }



//            lock.lock();
//            try {
//                shop.desShelves();
//            } finally {
//                lock.unlock();
//            }
        }
    }
}
