## [Lesson00](index.md) > Exercise03:

Write a program that, given a file of English text, encrypts the passage using a codeword shift. 
The codeword and the names of the input and output files are supplied interactively. 

Assume that the input file contains only alphabetical characters and no whitespace.

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below:
   ```
   package org.dii.oop;
   import java.io.*;
   import org.dii.oop.lesson00.exercise03.Lesson;

   public class App {
     public static void main(String[] args) throws IOException {

       System.output.println("Start....Exercise 3: Read and Write Files ");
   
       Lesson.run();
    }
   }
   ```


2. Open class [Lesson 00 - Exercise 3 - Lesson.java File](../../app/src/main/java/org/dii/oop/lesson00/exercise03/Lesson.java) in package `org.dii.oop.lessoon00.exercise03`.

    The encrypt method `public static String encrypt(String msg, String cw)`  will encrypt an input message by using a codeword to shift each letter. 

    For example, assume that the codeword is "CAT" and the message is "LEOPARD". If we agree that A occupies position 0 in the alphabet, B holds position 1, C is in position 2, and so on, then the letters of the codeword "CAT" occupy alphabet positions 2(C), 0(A), and 19(T) and consequently represent successive alphabet shifts of 2, 0, and 19 places when encrypting the message. Thus, to encode "LEOPARD" replace:

    *L with N: a 2-place shift (C)*

    *E with E: a 0-place shift (A)*

    *O with H: a 19-place shift (T)*

    *P with R: a 2-place shift (C)*

    *A with A: a 0-place shift (A)*

    *R with K: a 19-place shift (T)*

    *D with F: a 2-place shift (C)*

   By repeatedly cycling the codeword "CAT", this method transforms "LEOPARD" into "NEHRAKF".


3. Modify the `run` method to open and read a message from [message.txt](../../app/src/main/java/org/dii/oop/lesson00/exercise03/message.txt).


4. Add code to ask the user to enter a codeword and store it in `String codeword;`.


5. Add code to ask the user to enter an output file name and store it in `String encryptedFile;`.


6. Add the following code to open the output file

   ```
   File outputFile = new File(encryptedFile);
   PrintWriter output = new PrintWriter(outputFile);
   if (!outputFile.exists())
   {
        System.out.println("Error: cannot open " 􏰋 encryptedFile);
        System.exit(0);
   }
   ```

7. Read each line by the while loop below.    

   ```
   while( input.hasNext()) // encrypt the file line by line
   {
        String line = input.nextLine();
        String encryptedLine = encrypt(line, codeword);
        output.println(encryptedLine);
   }
   ```
   In each iteration:
   - the program  reads a line in the input file. 
   - the program  calls the encrypt method by passing codeward (cw) and line (msg) as arguments.
   - the program writes the string that returns from the encrypt method into the output file.

8. Do not forget to close the scanners for both input and output. 

   ```
   input.close();
   output.close();
   ```
   
9. Run and observe the result.