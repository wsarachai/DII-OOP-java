package org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.Vector;

public class Lesson {

    public static void run() {
        Vector<Shape> shapes = new Vector<>();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Right triangle");
            System.out.println("4. Square");
            System.out.println("5. Resize shape");
            System.out.println("6. Display all shape");
            System.out.println("7. exit");
            System.out.print("Please select [1-7]: ");
            String choice = in.nextLine();

            // TODO: write your code here

            if ("7".trim().equals(choice)) {
                break;
            }
        } while(true);

        in.close();
    }
}