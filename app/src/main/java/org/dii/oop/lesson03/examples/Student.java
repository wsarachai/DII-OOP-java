package org.dii.oop.lesson03.examples;

public class Student {
    int stuID;
    String stuName;
    int stuAge;

    Student() {
        // Default constructor
        stuID = 100;
        stuName = "New Student";
        stuAge = 18;
    }

    Student(int num1, String str, int num2) {
        // Parameterized constructor
        stuID = num1;
        stuName = str;
        stuAge = num2;
    }
}

