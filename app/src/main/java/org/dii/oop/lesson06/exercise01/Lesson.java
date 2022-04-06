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

            if ("1".trim().equals(choice)) {
                System.out.print("\nEnter radius: ");
                String strRadius = in.nextLine();
                double radius = Double.parseDouble(strRadius);
                shapes.add(new Circle(radius));
            } else if ("2".trim().equals(choice)) {
                System.out.print("\nEnter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter high: ");
                String strHigh = in.nextLine();
                double width = Double.parseDouble(strWidth);
                double high = Double.parseDouble(strHigh);
                shapes.add(new Rectangle(width, high));
            } else if ("3".trim().equals(choice)) {
                System.out.print("\nEnter base: ");
                String strBase = in.nextLine();
                System.out.print("Enter high: ");
                String strHigh = in.nextLine();
                double base = Double.parseDouble(strBase);
                double high = Double.parseDouble(strHigh);
                shapes.add(new RightTriangle(base, high));
            } else if ("4".trim().equals(choice)) {
                System.out.print("\nEnter side: ");
                String strSide = in.nextLine();
                double side = Double.parseDouble(strSide);
                shapes.add(new Square(side));
            } else if ("5".trim().equals(choice)) {
                System.out.print("\nEnter ratio for all shape: ");
                String strRatio = in.nextLine();
                double ratio = Double.parseDouble(strRatio);
                for (Shape shape : shapes) {
                    Resizeable obj = (Resizeable) shape;
                    obj.resize(ratio);
                }
            } else if ("6".trim().equals(choice)) {
                System.out.println("\nList all shape:");
                for (Shape shape : shapes) {
                    System.out.println(shape);
                }
            } else if ("7".trim().equals(choice)) {
                break;
            }
        } while(true);

        in.close();
    }
}