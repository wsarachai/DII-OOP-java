package org.dii.oop.lesson09.ex02;

public class TaskRunner {
    private static int number;
    private static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
            }

            System.out.println(number);
        }
    }

    public static void run() throws InterruptedException {
        System.out.println("Start...");
        new Reader().start();
        Thread.sleep(100);
        number = 42;
        ready = true;
        System.out.println(Thread.currentThread().getName() + " is done...");
    }
}
