package org.dii.oop.lesson00.exercise02;
import java.util.*;
import java.io.*;

public class Lesson {

    public static void run()  throws IOException {

        System.out.println("Hello Exercise 2 !");

        // mac os version
        //File inputFile = new File("org/dii/oop/lesson00/exercise02/file_name.txt");

        // window version
        File inputFile = new File("org\\dii\\oop\\lesson00\\exercise02\\sdlc.txt");

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