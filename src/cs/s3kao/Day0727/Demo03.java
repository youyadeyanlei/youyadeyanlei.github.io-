package cs.s3kao.Day0727;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo03 {

    public List<Integer> number(int x,int y){
        List<Integer> list = new ArrayList<Integer>();
        if (x==0&&x==1){
            list.add(x);
            return list;
        }
        int count1 = 0;//质数个数
        int count2 = 0;//循环次数
        for(int i=x;i<=y;i++) {
            int flag = 0;//用作标记，如果是质数就为0，不是质数就为1
            for(int j=2;j<i;j++){
                count2++;
                if(i % j == 0 ){
                    flag = 1;//不是质数，改为1
                }
            }
            if(flag == 0){
                list.add(i);
                count1++;
            }
        }
//        System.out.println(count1);
//        System.out.println(count2);
        return list;

    }
    public static void main(String[] args) {
        CompletableFuture t1=CompletableFuture.supplyAsync(()->1);
        CompletableFuture t2=CompletableFuture.supplyAsync(()->2);
        CompletableFuture t3=CompletableFuture.supplyAsync(()->3);
        CompletableFuture all=CompletableFuture.allOf(t1,t2,t3);

        List<Integer> list= new ArrayList<>();
        Demo03 demo03 = new Demo03();
        all.thenRun(()->{
            t1.thenRun(()->{
               list.addAll(demo03.number(0,1000));
            //    System.out.println(list);
            });
            t2.thenRun(()->{
                list.addAll(demo03.number(1001,2000));
              //  System.out.println(list);
            });
            t3.thenRun(()->{
                list.addAll(demo03.number(2001,3000));
               // System.out.println(list);
            });
            System.out.println("----------");
            System.out.println(list);

    });



//        ExecutorService service = Executors.newFixedThreadPool(3);
//        List<Integer> list= new ArrayList<>();
//        Demo03 demo03 = new Demo03();
//        try {
//           list.addAll(demo03.number(0,1000));
////            for (int i = 0; i < 5; i++) {
////                service.submit(() ->
////                        System.out.println(Thread.currentThread().getName() + "")
////                );
////            }
//            System.out.println(list);
//        } finally {
//            service.shutdown();
//        }
//    }

}}
