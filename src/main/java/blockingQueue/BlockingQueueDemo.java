package blockingQueue;

import java.util.concurrent.*;

/*introduced in i.5
 * supports control flow.
 * Throw null pointer exception if null value is enqueue.
 * if a thread wants to delete then it will not allow unless data are enqueue.
 * if a thread wants to enqueue in full blockingQueue then it won't allow unless space is created by other
 * implementation classes are ArrayListBlockingQueue, and LinkedListBlockingQueue.
 * It is thread safe.
 * Comes in concurrent package.
 * */
public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> demo = new ArrayBlockingQueue<String>(5);
        demo.put("rajesh");
        demo.put("rajesh");
        demo.put("rajesh");
        demo.put("rajesh");
        System.out.println("Queue:" + demo);

    }
}
