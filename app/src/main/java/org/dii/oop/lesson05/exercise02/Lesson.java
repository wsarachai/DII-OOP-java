package org.dii.oop.lesson05.exercise02;

import java.util.Scanner;
import java.util.Vector;

public class Lesson {

    static Vector<Trainee> trainees = new Vector<>();

    public static void run() {
        // TODO: write your code here.
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Register");
            System.out.println("2. List trainee");
            System.out.println("3. exit");
            System.out.print("Please select [1-3]:");
            String method = in.nextLine().trim();

            if ("1".equals(method)) {
                System.out.println(">> Register new trainee");
                System.out.println("1. Student");
                System.out.println("2. University staff");
                System.out.println("3. General people");
                System.out.println("4. Go to main menu");
                System.out.print("Please select [1-4]:");
                String choice = in.nextLine().trim();

                if ("1".equals(choice)) {
                    System.out.print(">>> Enter name: ");
                    String name = in.nextLine().trim();
                    System.out.print(">>> Enter email: ");
                    String email = in.nextLine().trim();
                    System.out.print(">>> Enter student ID: ");
                    String stuId = in.nextLine().trim();
                    System.out.print(">>> Enter major: ");
                    String major = in.nextLine().trim();
                    Student student = new Student(name, email, stuId, major);
                    trainees.add(student);
                }
                if ("2".equals(choice)) {
                    System.out.print(">>> Enter name: ");
                    String name = in.nextLine().trim();
                    System.out.print(">>> Enter email: ");
                    String email = in.nextLine().trim();
                    System.out.print(">>> Enter position: ");
                    String position = in.nextLine().trim();
                    Staff staff = new Staff(name, email, position);
                    trainees.add(staff);
                }
                if ("3".equals(choice)) {
                    System.out.print(">>> Enter name: ");
                    String name = in.nextLine().trim();
                    System.out.print(">>> Enter email: ");
                    String email = in.nextLine().trim();
                    System.out.print(">>> Enter occupation: ");
                    String occupation = in.nextLine().trim();
                    Person person = new Person(name, email, occupation);
                    trainees.add(person);
                }
            }
            if ("2".equals(method)) {
                System.out.println(">> List trainee");
                for (Trainee trainee : trainees) {
                    if (trainee instanceof Student) {
                        Student student = (Student) trainee;
                        student.display();
                    }
                    if (trainee instanceof Staff) {
                        Staff staff = (Staff) trainee;
                        staff.display();
                    }
                    if (trainee instanceof Person) {
                        Person person = (Person) trainee;
                        person.display();
                    }
                }
            }
            if ("3".equals(method)) {
                break;
            }

        } while (true);
    }
}