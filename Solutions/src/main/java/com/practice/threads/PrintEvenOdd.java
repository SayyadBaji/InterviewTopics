package com.practice.threads;

public class PrintEvenOdd {
    static int count = 10;
    static int counter = 1;
    public static void main(String[] args) {
        PrintEvenOdd printEvenOdd = new PrintEvenOdd();
        Thread oddThread = new Thread(()->printEvenOdd.printOdd());
        oddThread.setName("OddThread");
        Thread evenThread = new Thread(()->printEvenOdd.printEven());
        evenThread.setName("EvenThread");
        oddThread.start();
        evenThread.start();
    }

    private void printOdd() {
        synchronized (this) {
            while (counter<count) {
                if (counter%2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter+" by: "+Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }

    private void printEven() {
        synchronized (this) {
            while (counter<count) {
                if (counter%2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter+" by: "+Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }
}
