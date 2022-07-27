package cs.s3kao.Day0726;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo05 {
    private int totalBytes;
    private Lock lock=new ReentrantLock();
    public void  incremenTotalBytes(){
        lock.lock();
        try {
            totalBytes++;
        }finally {
            lock.unlock();
        }
    }
    public int getTotalBytes() {
        return totalBytes;
    }
}
class Downsynchronized{
    private  int totalBytes;
    public synchronized void incremenTotalBytes(){
        totalBytes++;
    }
    public int getTotalBytes() {
        return totalBytes;
    }
}
 class Dowsys{
    private int totalBytes;

    private final Object totalBytes01=new Object();

    public void incremenTotalBytes(){
        synchronized ((totalBytes01)){
            totalBytes++;
        }
    }
    public int getTotalBytes() {
        return totalBytes;
    }
}