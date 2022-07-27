package cs.s3kao.Day0727;

import java.util.concurrent.CompletableFuture;

public class Demo07 {
    public static void main(String[] args) {
        CompletableFuture future=CompletableFuture.supplyAsync(()->{
            System.out.println("异步逻辑");
            return 1;
            //异步任务有返回值，在后续任务中获取异步任务处理结果：
        });
        future.thenRunAsync(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("后逻辑");
        });
        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });
    }
}
