## [Lesson03](index.md) > Exercise03:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson03.exercise03.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson lesson = new Lesson();
       lesson.start();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson03/exercise03/Lesson.java) in package `org.dii.oop.lesson03.exercise03` and follow the instructions below:
   - From the previous lesson ([lesson02->exercise04](../lesson02/exercise04.md)), copy the previous code (all shape classes) to this package and modify the code to use a constructor to initialize the attribute used in each class. (You have to determine what is the class's attribute).
   