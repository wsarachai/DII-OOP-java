package org.dii.oop.lesson02.exercise02;

/*
 * Variable scope, try to fix the error.
 */
public class Lesson {
    static String root = "I'm available to all lines of code within my context";

    public void start() {
        String spy = "I'm a spy";
        {
            String insideCurlyBrackets="I'm an insider";
        }
        System.out.println(root);
        System.out.println(spy);

        // TODO: Remove the comment below and try to fix the error.
        // System.out.println(insideCurlyBrackets);
    }
}
