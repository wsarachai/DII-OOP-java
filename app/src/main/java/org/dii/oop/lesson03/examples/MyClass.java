package org.dii.oop.lesson03.examples;

class MyClass {
    private String name;
    private int age;

    MyClass() {
        this("Hello, World!!");
    }

    MyClass(String s) {
        this(s, 6);
    }

    MyClass(String s, int age) {
        this.name = s;
        this.age = age;
    }

    public static void main(String args[]) {
        MyClass myobj = new MyClass();
    }
}

