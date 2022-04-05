package org.dii.oop.lesson05.ex01;

public class PhysicsTeacher extends Teacher {
    String mainSubject = "Physics";

    public static void run() {
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.work();
    }
}
