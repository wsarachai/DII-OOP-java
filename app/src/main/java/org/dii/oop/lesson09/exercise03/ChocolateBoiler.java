package org.dii.oop.lesson09.exercise03;

public class ChocolateBoiler {
    private static volatile ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    /*
     * This code is only started
     * when the boiler is empty!
     */
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /* To fill the boiler it must be
     * empty, and once it's full, we set
     * the empty and boiled flags.
     */
    public synchronized void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("[" + this + "] " + Thread.currentThread().getName() + ": step1-fill the boiler with a milk/chocolate mixture");
        }
    }

    /*
     * To boil the mixture, the boiler
     * has to be full and not already boiled.
     * Once it's boiled we set the boiled to true
     */
    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("[" + this + "] " + Thread.currentThread().getName() + ": step2-bring the contents to a boil");
            boiled = true;
        }
    }

    /*
     * To drain the boiler, it must be full
     * (non-empty) and also boiled. Once it is
     * drained we set empty back to true
     */
    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("[" + this + "] " + Thread.currentThread().getName() + ": step3-drain the boiled milk and chocolate");
            empty = true;
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
