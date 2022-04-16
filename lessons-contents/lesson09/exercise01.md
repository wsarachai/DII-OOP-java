## [Lesson08](index.md) > Exercise01

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson08.exercise01.Lesson;

   public class App {
     public static void main(String[] args) {
       lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson08/exercise01/Lesson.java) in package `org.dii.oop.lesson08.exercise01` and follow the instructions below:
   - The SimUDuck is a game that shows a large variety of duck species swimming and making quacking sounds.
   - The initial phase of the game has duck species including:
     1. Mallard duck
     2. Redhead duck
     3. Rubber duck
     4. Decoy duck
   - Design the classes of the SimUDuck game using OOP design. Let the initial classes design as shown below:
     
     ![img_1.png](img_1.png)
   
   - Note: there are three types of duck sounds: `quack!!`, `squeak!!`, and `no sound!!`

3. The running output of the SimUDuck game is shown below.
   ```
   1. Add new duck
   2. Display all duck
   3. exit
   Select number [1-3]: 1
   
   1. Mallard duck
   2. Redhead duck
   3. Rubber duck
   4. Decoy duck
   Select number [1-4]: 1
   
   Enter the name of Mallard duck: Duck-1
   ```
   ```
   1. Add new duck
   2. Display all duck
   3. exit
   Select number [1-3]: 1
   
   1. Mallard duck
   2. Redhead duck
   3. Rubber duck
   4. Decoy duck
   Select number [1-4]: 2
   
   Enter the name of Redhead duck: Redhead-1
   ```
   ```
   1. Add new duck
   2. Display all duck
   3. exit
   Select number [1-3]: 1
   
   1. Mallard duck
   2. Redhead duck
   3. Rubber duck
   4. Decoy duck
   Select number [1-4]: 4
   
   Enter the name of Decoy duck: Decoy-1
   ```
   ```
   1. Add new duck
   2. Display all duck
   3. exit
   Select number [1-3]: 2
   
   Duck list:
   ## Mallard duck: name => Duck-1, sound => quack!!
   ## Redhead duck: name => Redhead-1, sound => squeak!!
   ## Decoy duck: name => Decoy-1, sound => No sound!!
   
   Enter the duck name: duck-1
   ```