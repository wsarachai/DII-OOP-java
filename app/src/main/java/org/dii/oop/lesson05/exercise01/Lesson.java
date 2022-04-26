package org.dii.oop.lesson05.exercise01;

import org.checkerframework.checker.units.qual.A;

public class Lesson {

    public static void run() {
        // TODO: write your code here.
        Animal a = new Cow();
        a.test1();
        a.test2();
        if (a instanceof Cow) {
            Cow c = (Cow) a;
            c.test3();
            if (c instanceof RedCow) {
                RedCow rc = (RedCow) c;
                rc.test4();
            }
        }
    }
}