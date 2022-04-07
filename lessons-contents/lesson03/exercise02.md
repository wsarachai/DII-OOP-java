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
   - Write a program to print the names of students by creating a `org.dii.oop.lesson03.exercise02.Student` class. If no name is passed while creating an object of the [Student](../../app/src/main/java/org/dii/oop/lesson03/exercise02/Student.java) class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating an object of the Student class.
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

3. The output program
   ```
   > Task :app:run
   XYZ
   Unknown
   ```