package org.dii.oop.lesson00.exercise03;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson {

    public static String encrypt(String msg, String cw) {
        String encryptedMessage = new String();
        msg = msg.toUpperCase();
        cw = cw.toUpperCase();
        for (int i =0;i <msg.length(); i++)
        {
            char ch =msg.charAt(i);
            int shift =(cw.charAt(i % cw.length()) -'A');
            int oldPositionInAlphabet =ch -'A';
            int newPositionInAlphabet =(oldPositionInAlphabet +shift) %26;
            encryptedMessage =encryptedMessage +(char) (newPositionInAlphabet +'A');
        }
        return encryptedMessage;
    }

    public static void run() throws IOException {

        System.out.println("Hello Exercise 3 !");

        File inputFile = new File("org\\dii\\oop\\lesson00\\exercise03\\message.txt");

        if( ! inputFile.exists())
        {
            System.out.println("File message.txt not found ");
            System.exit(0);
        }

        Scanner input = new Scanner(inputFile);

        String encryptedFile = "outputfile.txt";
        File outputFile = new File(encryptedFile);
        PrintWriter output = new PrintWriter(outputFile);
        if (!outputFile.exists())
        {
            System.out.println("Error: cannot open " + encryptedFile);
            System.exit(0);
        }

        String line; // to hold one full line from the file
        while (input.hasNext()) // while there is more data
        {
            line = input.nextLine(); // advance to next line, returns all "skipped" data
            String encode = encrypt(line, "CAT");
            System.out.println(encode);
            output.println(encode);
        }
        input.close();
        output.close();
    }
}