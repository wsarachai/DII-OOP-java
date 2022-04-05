## [Lesson05](index.md) > Exercise01:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson05.exercise01.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson lesson = new Lesson();
       lesson.start();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Lesson.java) in package `org.dii.oop.lesson05.exercise01` and follow the instructions below:
   - Create a new class name [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) and define the `name` attribute to store the name of the shape, and the `numSide` attribute to store a number of shape sides.
   - Create class [`Circle`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Circle.java) and make it inherit from the [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) class with its constructor having a parameter for its radius.
   - Create class [`Triangle`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Triangle.java) and make it inherit from the [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) class with its constructor having a parameter for its side (base and high).
   - Create class [`Rectangle`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Rectangle.java) and make it inherit from the [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) class with its constructor having a parameter for its side (width and high).
   - Create class [`Square`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Square.java) and make it inherit from the [`Rectangle`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Rectangle.java) class with its constructor having a parameter for its side (suppose side) calling the constructor of its parent class as `super(side, side)`. Print the area and perimeter to output.
   - Every class except the class [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) defines a method `getArea()` and `getPerimeter()` to return the area and perimeter of its own shape.
   - This work tests your knowledge of inheritance. Your solution some class must inherit from Shape superclasses.


3. The output of the program:
   ```
   1. Circle
   2. Rectangle
   3. Triangle
   4. Rectangle
   5. Square
   6. exit
   Please select [1-6]: 1
   Enter the radius: 5
   
   The circle area is 78.54, and the perimeter is 31.42
   ```
   ```
   1. Circle
   2. Rectangle
   3. Triangle
   4. Rectangle
   5. Square
   6. exit
   Please select [1-6]: 3
   Enter the base: 3
   Enter the high: 5
   
   The triangle area is 7.50, and the perimeter is 5.83
   ```
   ```
   1. Circle
   2. Rectangle
   3. Triangle
   4. Rectangle
   5. Square
   6. exit
   Please select [1-6]: 2
   Enter the width: 5
   Enter the high: 7
   
   The rectangle area is 35.00, and the perimeter is 24.00
   ```
   ```
   1. Circle
   2. Rectangle
   3. Triangle
   4. Rectangle
   5. Square
   6. exit
   Please select [1-6]: 5
   Enter the side: 5
   
   The triangle area is 25.00, and the perimeter is 20.00
   ```
   