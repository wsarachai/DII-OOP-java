## [Lesson03](index.md) > Exercise02:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson03.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson03/exercise02/Lesson.java) in package `org.dii.oop.lesson03.exercise02` and follow the instructions below:
   - Write a program to print the names of students, So, you have to create a `Student` class and place it in the `org.dii.oop.lesson03.exercise02` package. If no argument name is passed to the constructor while creating an object of the `Student` class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating an object of the `Student` class.
   ```
   ...
   
   public class Lesson {
     public static void run() {
       Student s = new Student("XYZ");
       Student a = new Student();

       System.out.println(s.name);
       System.out.println(a.name);
     }
   }
   ```

3. Run the code.
   ```
   > Task :app:run
   XYZ
   Unknown
   ```