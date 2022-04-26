package org.dii.oop.lesson05.exercise02;

public class Person extends Trainee {
    private String occupation;

    public Person(String name, String email, String occupation) {
        super(name, email);
        this.occupation = occupation;
    }

    public void display() {
        super.display();
        System.out.printf("Occupation: %s\n",
                getOccupation());
    }

    public String getOccupation() {
        return occupation;
    }
}
