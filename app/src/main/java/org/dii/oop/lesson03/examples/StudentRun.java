package org.dii.oop.lesson03.examples;

public class StudentRun {
    public static void run() {
        // This object creation would call the default constructor
        Student myobj = new Student();
        System.out.println("Student Name is: " + myobj.stuName);
        System.out.println("Student Age is: " + myobj.stuAge);
        System.out.println("Student ID is: " + myobj.stuID);
        /*
         * This object creation would call the parameterized constructor
         * Student(int, String, int)
         */
        Student myobj2 = new Student(555, "Chaitanya", 25);
        System.out.println("Student Name is: " + myobj2.stuName);
        System.out.println("Student Age is: " + myobj2.stuAge);
        System.out.println("Student ID is: " + myobj2.stuID);
    }
}

