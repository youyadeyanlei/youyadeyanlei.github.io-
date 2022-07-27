package cs.s3kao.Day0727;

import cs.作业.biao.RandomUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo01 {
    private static class Info {
        //生产的随机数
        int randomNumber;
        //时间
        long duration;

        public Info(int randomNumber, long duration) {
            this.duration = duration;
            this.randomNumber = randomNumber;
        }


        public int getRandomNumber() {
            return randomNumber;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = null;
        List<Future<Info>> list = new ArrayList<>();

        try {
            pool = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 10; i++) {
                Future<Info> future = pool.submit(() -> {
                            long t1 = System.currentTimeMillis();
                            RandomUtils.longSleep(3000, 7000);
                            int num = RandomUtils.randomNumber(1000);
                            long t2 = System.currentTimeMillis();
                            return new Info(num, (t2 - t1));
                        }

                );
                list.add(future);
            }
            List<Info> infos = new ArrayList<>();
            for (Future<Info> f : list) {
                Info info = f.get();
                infos.add(info);
            }
//            Collections.sort(infos, ( o1,  o2) ->{
//                    // if (o1.getRandomNumber()>o2.getRandomNumber()) return 1;
//                     Integer.compare(o1.getRandomNumber(),o2.getRandomNumber());
//                     return  0;
//                }
//            });
            Collections.sort(infos, ((o1, o2) -> Integer.compare(o1.getRandomNumber(), o2.getRandomNumber())));

            System.out.println(infos);
        } finally {
            pool.shutdown();
        }


    }
}
