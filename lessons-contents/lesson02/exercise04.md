## [Lesson02](index.md) > Exercise04:

Create a Java program to find an area of shape.
* Students must be designed the program to include at least three classes: `Circle`, `Rectangle`, and `Triangle` classes and place them in the package `org.dii.oop.lesson02.exercise04`.
* Designed all shape classes to have `callArea()` method. The method does its own behavior of their class, for example, the `calArea()` method of the Circle class must be calculated the area of a circle shape, and for the Triang class, the `calArea()` method must be calculated the area of a triangle shape.
* Students can use build-in class `Scanner` to get the keyboard input as shown the example below:
  ```
  Scanner in = new Scanner(System.in);
  System.out.print("Please type a string: ");
  String s = in.nextLine();
  System.out.println("You entered string " + s);
  System.out.print("Please type a int value: ");
  int a = in.nextInt();
  System.out.println("You entered integer " + a);
  System.out.print("Please type a float falue: ");
  float b = in.nextFloat();
  System.out.println("You entered float " + b);
  // closing scanner
  in.close();
  ```

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson02.exercise04.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson.run();
    }
   }
   ```

2. Edit class  [Lesson](../../app/src/main/java/org/dii/oop/lesson02/exercise04/Lesson.java) in package `org.dii.oop.lesson02.exercise04` to write the program.


3. Run the code:
```
> Task :app:run
1. Circle
2. Rectangle
3. Triangle
Please select the shape [1-3]: 1
Enter the radius: 5
The circle area is 78.5
```
```
> Task :app:run
1. Circle
2. Rectangle
3. Triangle
Please select the shape [1-3]: 2
Enter the width: 3
Enter the height: 5
The rectangle area is 15.0
```
```
> Task :app:run
1. Circle
2. Rectangle
3. Triangle
Please select the shape [1-3]: 3
Enter the base: 4
Enter the height: 6
The triangle area is 12.0
```