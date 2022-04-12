## [Lesson06](index.md) > Exercise02:
Challenge exercise:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson06.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {
       lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson06/exercise02/Lesson.java) in package `org.dii.oop.lesson06.exercise02` and follow the instructions below:
   - Use the shape classes form the previous `exercise01` to complete this execrise.
   - Change the command-line base program from `exercise01` to a GUI application. 
   - The `javax.swing.JFrame` class is a type of container which inherits the `java.awt.Frame` class. JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI.
   - In our GUI Shape application, we created `org.dii.oop.lesson06.exercise02.ShapeApp` class extends the `javax.swing.JFrame` class which inherit all parent behavior class, so we do not write all code to manage GUI applications just write the code needed for our program.
   - The `org.dii.oop.lesson06.exercise02.ShapeApp` class implement the `java.awt.event.ActionListener` interface which handle the user action interact to the GUI controls. 
   - The `javax.swing.JPanel` class is a container that can store a group of components. The main task of JPanel is to organize components, various layouts can be set in JPanel which provides a better organization of components.
   - In our GUI Shape application, we added the `java.awt.Panel` and we use this panel to draw the store the GUI controls such as TextBox, Button, etc.
   - Wait to the instructor explain the concept of the GUI Application and related classes.
   - Complete the `Shape Application` by find the `TODO:` task in the code.


3. The output of the program:
   
   ![img.png](img.png)
   