package FutureCompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

class MySuplier implements Supplier<Integer> {

    @Override
    public Integer get() {
        return 1;
    }
}

class MyFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 1;
    }
}

public class DemoCompletableFuture {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(new MySuplier(), executor);
        System.out.println(completableFuture.isDone());
        CompletableFuture<Integer> completableFuture1 = completableFuture.thenApply(new MyFunction());
        System.out.println(completableFuture1.get()); // Waits until the "calculation" is done, then prints 2

    }
}
