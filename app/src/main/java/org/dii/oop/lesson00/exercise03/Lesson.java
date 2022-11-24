package org.dii.oop.lesson00.exercise03;

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

    public static void run() {

        System.out.println("Hello Exercise 3 !");

    }
}