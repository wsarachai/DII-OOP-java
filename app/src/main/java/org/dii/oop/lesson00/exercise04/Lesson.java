package org.dii.oop.lesson00.exercise04;

import java.util.*;
import java.io.*;

public class Lesson {

    public static void run() throws IOException {

        System.out.println("Hello Exercise 4 !!");

        File inputFile = new File("org/dii/oop/lesson00/exercise04/m.txt");
        if( ! inputFile.exists())
        {
            System.out.println("File m.txt not found ");
            System.exit(0);
        }

        File inputFile2 = new File("org/dii/oop/lesson00/exercise04/n.txt");
        if( ! inputFile2.exists())
        {
            System.out.println("File n.txt not found ");
            System.exit(0);
        }
        String encryptedFile = "outputfilex.txt";
        File outputFile = new File(encryptedFile);
        PrintWriter output = new PrintWriter(outputFile);
        if (!outputFile.exists())
        {
            System.out.println("Error: cannot open " + encryptedFile);
            System.exit(0);
        }

        Scanner input1 = new Scanner(inputFile);
        Scanner input2 = new Scanner(inputFile2);

        String line1; // to hold one full line from the file
        String line2; // to hold one full line from the file
        int size=15;
        while (input1.hasNext()) // while there is more data
        {
            line1 = input1.nextLine(); // advance to next line, returns all "skipped" data
            line2 = input2.nextLine(); // advance to next line, returns all "skipped" data
            System.out.println(line1);
            String[] arrOfStr1 = line1.split(" ",size);
            String[] arrOfStr2 = line2.split(" ",size);
            int sum =0;
            for(int i = 0; i < arrOfStr1.length; i++)
            {
                sum = Integer.valueOf(arrOfStr1[i])+Integer.valueOf(arrOfStr2[i]);
                output.print(sum + " ");
            }
            output.println();

        }
        output.close();
        input1.close();
        input2.close();

    }
}