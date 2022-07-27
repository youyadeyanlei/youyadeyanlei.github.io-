package cs.s3kao.Day0727;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
    private static class Info{
        int randomize;
        long number;
      public Info(int randomize,long number){
          this.randomize=randomize;
          this.number = number;
      }
      int sleep=new Random().nextInt(500)+100;
    }

    public static void main(String[] args) {
        ExecutorService pool=null;
        int sleep =new Random().nextInt(500)+100;
        try {
            pool = Executors.newFixedThreadPool(3);
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            pool.shutdown();
        }
    }


}
