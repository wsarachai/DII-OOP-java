## [Lesson02](index.md) > Exercise03:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson02.exercise03.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson.run();
    }
   }
   ```

2. Creates a package called `org.dii.oop.lesson02.exercise03.animals`. (**Note:** *The names of packages is a lower-case letters to avoid any conflicts with the names of classes*) and Create the Mammal class as shown below:
     ```
     package org.dii.oop.lesson02.exercise03.animal;

     public class Mammal {
       public void eat() {
         System.out.println("Mammal eats");
       }
    
       public void travel() {
         System.out.println("Mammal travels");
       }
     }

     ```


3. Edit class  [Lesson](../../app/src/main/java/org/dii/oop/lesson02/exercise03/Lesson.java) in package `org.dii.oop.lesson02.exercise03` and follow the instructions.


4. Run the code:
```
> Task :app:run
Mammal eats
Mammal travels
```