## [Lesson01](index.md) > Exercise02: Multiple Book Instance:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package ```org.dii.oop.App``` and edit the code as display below:
   ```
   package org.dii.oop;

   import org.dii.oop.lesson01.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson lesson = new Lesson();
       lesson.start();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson01/exercise02/Lesson.java) in package ```org.dii.oop.lesson01.exercise02``` to create the book1 and book2 instance with the following instructions:
   - book1:
     - title: Milkman: A Novel
     - author: Anna Burns
     - numberOfPages: 200
   - book2
     - title: The Undefeated
     - author: Kwame Alexander, Kadir Nelson
     - numberOfPages: 300


3. The program will print the information to output as shown below:
```
> Task :app:run
The title of the book is Milkman: A Novel
Its author isAnna Burns
It contains 200

The title of the book is The Undefeated
Its author isKwame Alexander, Kadir Nelson
It contains 300
```
