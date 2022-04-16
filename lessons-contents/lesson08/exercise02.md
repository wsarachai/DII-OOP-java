## [Lesson08](index.md) > Exercise02

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson08.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {
       lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson08/exercise02/Lesson.java) in package `org.dii.oop.lesson08.exercise02` and follow the instructions below:
   - From the previous `exercise01`, the executives want to update the SimUDuck game to make the duck can fly.
   - The other thing you must know is in the future, the executive need for the SimUDuck game could add a new species of duck with no limit.
   - You must update the previous code to meet the requirement. (**_You must copy all classes from the previous exercise and modify it_**)
   - Note: **_Not all duck species can fly_**.

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
   ## Mallard duck: name => Duck-1, sound => quack!!, fly: I can fly!!
   ## Redhead duck: name => Redhead-1, sound => squeak!!, fly: I can fly!!
   ## Decoy duck: name => Decoy-1, sound => No sound!!, fly: I can't fly!!
   
   Enter the duck name: duck-1
   ```