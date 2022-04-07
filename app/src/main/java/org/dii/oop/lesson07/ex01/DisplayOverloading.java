package org.dii.oop.lesson07.ex01;

public class DisplayOverloading {
    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}
