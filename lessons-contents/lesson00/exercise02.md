## [Lesson00](index.md) > Exercise02:

Applications that require a large amount of data often take input from (or place output to) disk files that do not disappear  when you turn off your computer.

Permanent data reside in files. Most programs use and/or create data in files that exist before and persist after the program executes.

In this exercise, we are going to read to a text file (.txt file) and display the contents  on the screen.

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
 ```
   package org.dii.oop;

   import org.dii.oop.lesson00.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {

       System.output.println("Start....Exercise 2: Handling file");
   
       Lesson.run();
    }
   }
   ```
2. To accomplish this task, we need two Java classes:
   the `File class` and the `Scanner class`.

3. Open class [Lesson 00 - Exercise 2 - Lesson.java File](../../app/src/main/java/org/dii/oop/lesson00/exercise02/Lesson.java) in package `org.dii.oop.lessoon00.exercise02` and add the following code:
    ```
   import java.util.*;
   import java.io.*;
    ```
     
4. Add the following code into the `run()` method:
   
   **For Windows OS**
   ```
        File inputFile = new File("org\\dii\\oop\\lesson00\\exercise02\\file_name.txt");
        if( ! inputFile.exists())
        {
            System.out.println("File file_name.txt not found ");
            System.exit(0);
        }
   ```
   **For Mac OS**
   ```
        File inputFile = new File("org/dii/oop/lesson00/exercise02/file_name.txt");
        if( ! inputFile.exists())
        {
            System.out.println("File file_name.txt not found ");
            System.exit(0);
        }
   ```

   The added code is to instantiate a File object. Then it checks whether the file exists or not. If the file does not exist, the program will print out the warning message and terminates.

5. Because the File class resides in the java.io package, the program must notice the clause
   ```
   throws IOException
   ```

   in the header of main method in [App](../../app/src/main/java/org/dii/oop/App.java). The import statement is also needed.
   ```
      package org.dii.oop;
      import org.dii.oop.lesson00.exercise02.Lesson;
      import java.io.*;
      public class App {
         public static void main(String[] args) throws IOException {

         System.output.println("Start....Exercise 2: Handling file");
   
         Lesson.run();
         }
      }

   ```
   
   For now, whenever a method, e.g. run(...), uses the File class for Scanner I/O, include throws IOException in run(...)’s heading as well as in the heading of any other method that calls run(...).
   **Don't forget to add throws IOException in the run method header.**




6. We will read data from a sequential file, which must be accessed sequentially. For example, to read line 10, we must read line 1 to line 9.

7. Instantiate a Scanner object by adding the following code. 
    ```
    Scanner input = new Scanner(inputFile);
    ```
8. Read the file line by line. Add the following code after checked that the file can be opened. 
    ```
   String line; // to hold one full line from the file
    while (input.hasNext()) // while there is more data
   {
         line = input.nextLine(); // advance to next line, returns all "skipped" data
         System.out.println(line); 
    }
    ```
9. Very important. Do not forget to close the scanner that opened file. 
    ```
   input.close();
    ```
   
10. Run your code and observe the result!
11. Change the input file to be [sdlc.txt](../../app/src/main/java/org/dii/oop/lesson00/sdlc.txt) and observe the result.