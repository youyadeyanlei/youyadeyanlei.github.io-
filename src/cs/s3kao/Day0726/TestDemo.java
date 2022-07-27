package cs.s3kao.Day0726;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        Down01 stat=new Down01();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 2;i++) {
            Thread thread =new  Thread(new Download01(stat));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(stat.gettota());
    }
}
