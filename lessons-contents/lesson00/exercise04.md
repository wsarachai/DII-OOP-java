## [Lesson00](index.md) > Exercise04:

Write a program to calculate the addition of the integers in files two files. Then, the addition is written into a new file.
Note that the two input file must have the same number of integers per row and the same number of columns. 




1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below:
   ```
   package org.dii.oop;
   import java.io.*;
   import org.dii.oop.lesson00.exercise04.Lesson;

   public class App {
     public static void main(String[] args) throws IOException {

       System.output.println("Start....Exercise 4: Addition and Write the output to file c.txt");
   
       Lesson.run();
    }
   }
   ```
2. Open class [Lesson 00 - Exercise 4 - Lesson.java File](../../app/src/main/java/org/dii/oop/lesson00/exercise04/Lesson.java) in package `org.dii.oop.lessoon00.exercise04`.
    
    Edit the code to open files [m.txt](../../app/src/main/java/org/dii/oop/lesson00/exercise04/m.txt) and [n.txt](../../app/src/main/java/org/dii/oop/lesson00/exercise04/n.txt). In these two files, the number of integers in each row is 15.
   

3. Read the file line by line and then split the number by using the following statement. 
   ```
   String[] arrOfStr1 = line1.split(" ",15);
   ```
      where `line1` is a String. The string `split` method expects two parameters:

   - regex: a delimiting regular expression
   - limit: the resulting threshold
   

4. Covert string to integer by using the following statement
   ```
   int x = Integer.valueOf(arrOfStr1[i]);
   ```
5. Calculate the addition of each number.
6. Write the addition to the output file. The correct output is as displayed below,
   ```
    114 136 106 39 111 48 114 132 72 11 60 81 30 73 89
    96 52 153 69 40 124 33 125 117 186 139 115 143 117 120
    112 152 128 88 7 108 58 95 77 115 100 134 158 58 75
    26 168 114 55 191 26 67 67 62 138 28 92 146 61 150
    95 97 96 100 117 166 97 158 138 144 87 122 78 110 62
    127 51 124 105 107 44 56 108 73 87 138 57 71 79 147
    111 28 98 141 133 154 122 147 24 98 9 66 38 114 175
    80 130 144 164 63 119 39 63 97 152 18 182 150 77 105
    26 113 73 24 82 105 180 146 146 68 129 105 91 95 88
    60 157 10 137 139 142 87 46 75 123 47 69 103 70 44
    145 139 48 18 147 85 103 109 102 62 5 124 86 104 98
    111 113 112 105 191 105 9 171 97 62 26 33 100 177 98
    93 130 106 79 77 46 118 163 149 35 32 98 52 37 110
    45 34 26 33 70 123 56 72 89 75 31 115 111 79 102
    126 103 78 103 115 150 121 117 140 47 90 115 58 53 153 
   ```
   **Do not forget to close the inputs and the output.**


7. Change the input files to be [a.txt](../../app/src/main/java/org/dii/oop/lesson00/exercise04/a.txt) and [b.txt](../../app/src/main/java/org/dii/oop/lesson00/exercise04/b.txt). Change the number of integers from 15 to 1000.
8. Run the program and observe the result.
        
   
