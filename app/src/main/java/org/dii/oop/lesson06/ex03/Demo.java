package org.dii.oop.lesson06.ex03;

public class Demo implements MyInterface {
    /*
     * This class must have to implement both the abstract methods else you will get
     * compilation error
     */
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void run() {
        MyInterface obj = new Demo();
        obj.method1();
    }
}
