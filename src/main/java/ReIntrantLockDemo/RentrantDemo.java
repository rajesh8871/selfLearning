package ReIntrantLockDemo;

import java.util.concurrent.locks.ReentrantLock;

class MyRunnableClass33 implements Runnable {

    ReentrantLock lock;

    public MyRunnableClass33(ReentrantLock lock) {
        this.lock = lock;
    }

    public void run() {

        System.out.println(Thread.currentThread().getName()
                + " is Waiting to get the lock");

        lock.lock();

        System.out.println(Thread.currentThread().getName()
                + " has got the  lock.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(" has queued Threads = " + lock.hasQueuedThreads());

        System.out.println(Thread.currentThread().getName()
                + " has released the lock.");

        lock.unlock();    //read explanation for 5sec
    }
}

public class RentrantDemo {
    public static void main(String[] args) {

        MyRunnableClass33 myRnbl = new MyRunnableClass33(new ReentrantLock());
        new Thread(myRnbl, "Thread-1").start();

    }
}

