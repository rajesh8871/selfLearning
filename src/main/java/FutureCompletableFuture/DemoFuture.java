package FutureCompletableFuture;

import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(100);
        return 1;
    }
}

public class DemoFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyCallable());
        System.out.println(future.isDone());
        System.out.println(future.get());//Waits until the task is done, then prints 1

        //example
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<String> future1 = completableFuture
                .thenApply(s -> s + " World");

        CompletableFuture<String> future5
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future5, future2, future3);
        combinedFuture.get();

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));
        System.out.println(">>>>>>>>>>>"+combined);
    }

}
