## [Lesson01](index.md) > Exercise02:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson02.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson lesson = new Lesson();
       lesson.start();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson02/exercise02/Lesson.java) in package `org.dii.oop.lesson02.exercise02` and follow the instructions below:
   - Fix the error related to the scoping of the variable.


3. When you fixed the error, the output should be:
```
> Task :app:run
I'm available to all lines of code within my context
I'm a spy
I'm an insider
```