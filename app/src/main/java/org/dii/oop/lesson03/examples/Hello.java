package org.dii.oop.lesson03.examples;

public class Hello {
    String name;
    //Constructor
    Hello(){
        this.name = "Hello, world!!";
    }
    public static void run() {
        Hello obj = new Hello();
        System.out.println(obj.name);
    }
}
