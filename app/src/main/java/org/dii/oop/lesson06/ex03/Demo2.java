package org.dii.oop.lesson06.ex03;

public class Demo2 implements Inf2 {
    /*
     * Even though this class is only implementing the interface Inf2, it has to
     * implement all the methods of Inf1 as well because the interface Inf2 extends
     * Inf1
     */
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public static void run() {
        Inf2 obj = new Demo2();
        obj.method2();
    }
}
