package org.dii.oop.lesson03.exercise04;

import java.util.Scanner;

public class Lesson {
    Product[] products = new Product[6];

    public static void run() {

        Lesson lesson = new Lesson();

        lesson.products[0] = new Product("363369010",
                "Michael W. Apple",
                "Democratic Education in a Conservative Age",
                1993);
        lesson.products[1] = new Product("366817010",
                "Robin Barrow",
                "Giving Teaching Back to the Teachers",
                1984);
        lesson.products[2] = new Product("355056010",
                "Tom Bentley",
                "Learning Beyond The Classroom: Education for a Changing World",
                1998);
        lesson.products[3] = new Product("386926010",
                "C-Vitt",
                "ซีวิท รสเลมอน 140 มล. (แพ็ก 10 ขวด)",
                "เลมอน");
        lesson.products[4] = new Product("383306010",
                "คิวมินซี",
                "คิวมินซี เคอร์คิวมิน+แอล-กลูตาไธโอน 150 มล. (แพ็ก 6 ขวด)",
                "ขมิ้นชัน");
        lesson.products[5] = new Product("397208010",
                "เพรสแอนด์เชค",
                "เพรสแอนด์เชค คอลลาเจน วิตซี 3.5 กรัม (แพ็ก 12 กล่อง)",
                "คอลลาเจน วิตามินซี");

        String choice = "";

        do {
            // The program start here.
            System.out.println("DII shop:");
            System.out.println("1. Book");
            System.out.println("2. Food");
            System.out.print("Choose the number [1/2] to display product: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextLine();
            for (Product product : lesson.products) {
                if ("1".equals(choice) && "book".equals(product.type)) {
                    System.out.println("Code: " + product.code);
                    System.out.println("Author: " + product.author);
                    System.out.println("Book name: " + product.name);
                    System.out.println("Published: " + product.published);
                    System.out.println("-----------------------------");
                }
                if ("2".equals(choice) && "food".equals(product.type)) {
                    System.out.println("Code: " + product.code);
                    System.out.println("Brand: " + product.brand);
                    System.out.println("Book name: " + product.name);
                    System.out.println("Taste: " + product.taste);
                    System.out.println("-----------------------------");
                }
            }
            System.out.print("Do you want to continue [y/n]: ");
            choice = in.nextLine();
        } while ("y".equalsIgnoreCase(choice));
    }
}
