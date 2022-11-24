package org.dii.oop.lesson00.exercise04;

import java.util.*;
import java.io.*;

public class Lesson {

    public static void run() throws IOException {

        System.out.println("Hello Exercise 4 !!");

        File inputFile = new File("org/dii/oop/lesson00/exercise04/a.txt");
        if( ! inputFile.exists())
        {
            System.out.println("File a.txt not found ");
            System.exit(0);
        }

        Scanner input = new Scanner(inputFile);

        String line; // to hold one full line from the file
        while (input.hasNext()) // while there is more data
        {
            line = input.nextLine(); // advance to next line, returns all "skipped" data
            String[] arrOfStr = line.split(" ",3);
            for(int i = 0; i < arrOfStr.length; i++)
            {
                System.out.println(arrOfStr[i]);
            }
        }

    }
}