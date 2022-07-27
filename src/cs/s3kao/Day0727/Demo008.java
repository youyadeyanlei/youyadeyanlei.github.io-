package cs.s3kao.Day0727;

import java.util.concurrent.CompletableFuture;

public class Demo008 {
        public static void main(String[] args) {
            CompletableFuture future = CompletableFuture.supplyAsync(() -> 26);
            future.thenApply(c -> Float.toString( + 32))
                    .thenAccept(System.out::println);

        }

}
