package org.dii.oop.lesson05.exercise02;

public class Staff extends Trainee {
    private String position;

    public Staff(String name, String email, String position) {
        super(name, email);
        this.position = position;
    }

    public void display() {
        super.display();
        System.out.printf("Position: %s\n",
                getPosition());
    }

    public String getPosition() {
        return position;
    }
}
