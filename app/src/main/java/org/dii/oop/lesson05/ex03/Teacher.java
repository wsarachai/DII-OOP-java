package org.dii.oop.lesson05.ex03;

public class Teacher {
    private String designation = "Teacher";
    private String collegeName = "Beginnersbook";

    public String getDesignation() {
        return designation;
    }

    protected void setDesignation(String designation) {
        this.designation = designation;
    }

    protected String getCollegeName() {
        return collegeName;
    }

    protected void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    void work() {
        System.out.println("Teaching");
    }
}
