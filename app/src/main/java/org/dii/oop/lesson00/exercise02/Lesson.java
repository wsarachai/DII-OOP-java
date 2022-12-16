package org.dii.oop.lesson00.exercise02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson {

    public static void run() throws FileNotFoundException {
        File inputFile = new File("/Users/watcharinsarachai/Documents/workspace/java-projects/dii/DII-OOP-java/app/src/main/java/org/dii/oop/lesson00/exercise02/file_name.txt");
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
    }
}