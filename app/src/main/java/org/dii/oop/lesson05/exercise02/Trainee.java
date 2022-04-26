package org.dii.oop.lesson05.exercise02;

public class Trainee {
    private String name;
    private String email;

    public Trainee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.printf("Name: %s, Email: %s, ", name, email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
