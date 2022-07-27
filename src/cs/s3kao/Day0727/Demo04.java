package cs.s3kao.Day0727;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Demo04 {
    public static void main(String[] args) {
        Supplier<Integer> supplier =()->1;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(supplier);
        try {
            Integer r = future.get();
            System.out.println(r);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
