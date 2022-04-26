package org.dii.oop.lesson05.exercise02;

public class Student extends Trainee {
    private String studentId;
    private String major;

    public Student(String name, String email, String studentId, String major) {
        super(name, email);
        this.studentId = studentId;
        this.major = major;
    }

    public void display() {
        super.display();
        System.out.printf("ID: %s, Major: %s\n",
                getStudentId(),
                getMajor());
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }
}
