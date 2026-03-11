package com.rajesh.selflearning.threading;

import org.apache.catalina.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImplementingRunnable implements Runnable {

    public static void main(String args[]) {
        // create an object of Runnable target
        ImplementingRunnable gfg = new ImplementingRunnable();

        // pass the runnable reference to Thread
        Thread t = new Thread(gfg, "gfg");
        ExecutorService executorService = Executors.newCachedThreadPool();
        // start the thread
        t.start();

        // get the name of the thread
        System.out.println(t.getName());
    }

    @Override
    public void run() {
        System.out.println("Inside run method");
    }
}
