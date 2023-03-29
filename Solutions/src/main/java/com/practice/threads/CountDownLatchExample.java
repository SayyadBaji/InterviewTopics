package com.practice.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        executorService.submit(new MyThread(countDownLatch));
        executorService.submit(new MyThread(countDownLatch));
        executorService.submit(new MyThread(countDownLatch));
        countDownLatch.await();     //*** IMPORTANT method
        System.out.println("Need to execute after all threads execution done");
    }
}

class MyThread implements Runnable {
    private CountDownLatch countDownLatch;
    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("In run method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done");
        countDownLatch.countDown();
    }
}