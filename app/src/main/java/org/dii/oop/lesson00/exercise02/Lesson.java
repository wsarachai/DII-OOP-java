package org.dii.oop.lesson00.exercise02;
import java.util.*;
import java.io.*;

public class Lesson {

    public static void run() {

        File inputFile = new File("file_name.txt");
        if( ! inputFile.exists())
        {
            System.out.println("File file_name.txt not found ");
            System.exit(0);
        }

        Scanner input = new Scanner(inputFile);

        String line; // to hold one full line from the file
        while (input.hasNext()) // while there is more data
        {
            line = input.nextLine(); // advance to next line, returns all "skipped" data
            System.out.println(line);
        }
        input.close();


    }
}