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
            String choice = in.nextLine().trim();

            // TODO: write your code here
            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                String strRadius = in.nextLine();
                shapes.add(new Circle(Double.parseDouble(strRadius)));
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                shapes.add(new Rectangle(Double.parseDouble(strWidth),
                        Double.parseDouble(strHeight)));
            }
            if ("3".equals(choice)) {
                System.out.print("Enter base: ");
                String strBase = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                shapes.add(new RightTriangle(Double.parseDouble(strBase),
                        Double.parseDouble(strHeight)));
            }
            if ("4".equals(choice)) {
                System.out.print("Enter side: ");
                String strSide = in.nextLine();
                shapes.add(new Square(Double.parseDouble(strSide)));
            }
            if ("5".equals(choice)) {
                System.out.print("Enter ratio: ");
                String strRatio = in.nextLine();
                double ratio = Double.parseDouble(strRatio);

                for (Shape shape : shapes) {
                    shape.resize(ratio);
                }
            }
            if ("6".equals(choice)) {
                System.out.print("List all shape: ");
                for (Shape shape : shapes) {
                    System.out.println(shape);
                }
            }
            if ("7".equals(choice)) {
                break;
            }
        } while(true);

        in.close();
    }
}