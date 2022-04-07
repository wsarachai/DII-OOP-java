## [Lesson06](index.md) > Exercise01:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson06.exercise01.Lesson;

   public class App {
     public static void main(String[] args) {
       lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson07/exercise01/Lesson.java) in package `org.dii.oop.lesson07.exercise01` and follow the instructions below:
   - Create a new `abstract` class name [`Shape`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Shape.java) and define the `name` attribute to store the name of the shape, and the `numSide` attribute to store a number of shape sides, the access modifier of these two attributes is `private`.
   - Define the abstract methods of the class `Shape`: `public abstract double getArea()` and `public abstract double getPerimeter()` to return the area and perimeter of its own shape.
   - Create a new `interface` name [`Resizeable`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Resizeable.java) and define the method name `void resize()`.
   - Create class [`Circle`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Circle.java) and make it inherit from the [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) class with its constructor having a parameter for its radius and `implements` with [`Resizeable`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Resizeable.java) interface.
   - Create class [`RightTriangle`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/RightTriangle.java) and make it inherit from the [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) class with its constructor having a parameter for its side (base and high) and `implements` with [`Resizeable`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Resizeable.java) interface.
   - Create class [`Rectangle`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Rectangle.java) and make it inherit from the [`Shape`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Shape.java) class with its constructor having a parameter for its side (width and high) and `implements` with [`Resizeable`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Resizeable.java) interface.
   - Create class [`Square`](../../app/src/main/java/org/dii/oop/lesson06/exercise01/Square.java) and make it inherit from the [`Rectangle`](../../app/src/main/java/org/dii/oop/lesson05/exercise01/Rectangle.java) class with its constructor having a parameter for its side (suppose side) calling the constructor of its parent class as `super(side, side)`. Print the area and perimeter to output.
   - The abstract method defined in the superclass must be implemented in the subclass according to its behavior.


3. The output of the program:
   ```
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 1
   
   Enter radius: 5
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 2
   
   Enter width: 5
   Enter high: 5
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 3
   
   Enter base: 5
   Enter high: 5
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 4
   
   Enter side: 5
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 6
   
   List all shape:
   Name: circle, Number of side: 0, Area: 78.50, Perimeter: 31.40
   Name: rectangle, Number of side: 4, Area: 25.00, Perimeter: 20.00
   Name: right triangle, Number of side: 3, Area: 12.50, Perimeter: 17.07
   Name: square, Number of side: 4, Area: 25.00, Perimeter: 20.00
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 5
   
   Enter ratio for all shape: 0.5
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]: 6
   
   List all shape:
   Name: circle, Number of side: 0, Area: 19.63, Perimeter: 15.70
   Name: rectangle, Number of side: 4, Area: 6.25, Perimeter: 10.00
   Name: right triangle, Number of side: 3, Area: 3.13, Perimeter: 8.54
   Name: square, Number of side: 4, Area: 6.25, Perimeter: 10.00
   
   1. Circle
   2. Rectangle
   3. Right triangle
   4. Square
   5. Resize shape
   6. Display all shape
   7. exit
   Please select [1-7]:    
   ```
   