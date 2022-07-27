package cs.s3kao.Day0727;

import java.util.concurrent.CompletableFuture;

public class Demo09 {

        public static CompletableFuture<String> findEmailByIdAsync(int id) {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("根据id：" + id + "查询DB");
                return "a@b.com";
            });
        }

        public static CompletableFuture<String> findListByEmailAsync(String email) {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("根据email：" + email + "查询列表");
                return "播放列表";
            });
        }

        public static void main(String[] args) {
            findEmailByIdAsync(1)
                    .thenCompose(Demo09::findListByEmailAsync)
                    .thenAccept(System.out::println);
            LongTask.simulate(1000);
        }

}
