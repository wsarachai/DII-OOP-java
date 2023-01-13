package org.dii.oop.lesson04.exercise01;


import java.util.Scanner;

public class Lesson {

    static CarParking carParking = new CarParking();

    public static void run() {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("1. deposit");
            System.out.println("2. issued receipt");
            System.out.println("3. display all receipt");
            System.out.println("4. exit");
            System.out.print("Enter the method [1-4]: ");
            String choice = in.nextLine();

            if ("1".trim().equals(choice)) {
                // TODO: Code for deposit here

                System.out.println();
            } else if ("2".trim().equals(choice)) {
                // TODO: Code for issued receipt here

                System.out.println();
            } else if ("3".trim().equals(choice)) {
                // TODO: Code for display all receipt here

                System.out.println();
            } else if ("4".trim().equals(choice)) {
                break;
            } else {
                System.out.println("\n\tInvalid method number, try again !!\n");
            }
        } while (true);
    }
}
