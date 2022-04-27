package org.dii.oop.lesson09.ex02;

public class Test02 {
    private static class Worker extends Thread {
        @Override
        public void run() {
            doTask();
        }
    }

    public static void run() {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        worker1.start();
        worker2.start();
        worker3.start();

        doTask();
    }

    private static void doTask() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
