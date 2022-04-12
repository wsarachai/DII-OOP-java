## [Lesson01](index.md) > Exercise01:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson01.exercise01.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson01/exercise01/Lesson.java) in package `org.dii.oop.lesson01.exercise01` and follow the instructions below:
   - Under the first `TODO Step 1:` statement, create a variable named myBook and initialize it with an instance of the Book class.
     
     ```
     Book myBook = new Book();
     ```

   - Under the second `TODO Step 2:` statement, assign values to the title, author and numberOfPages fields of your myBook object using the dot operator.
     ```
     myBook.title = "Going Down Home with Daddy";
     myBook.author = "Starling Lyons, Daniel Minter";
     myBook.numberOfPages = 400;
     ```

   - Under the second `TODO Step 3:` write the code below to print the values.
     ```
     System.out.println("The title of the book is " + myBook.title + "\nIts author is" + myBook.author + "\nIt contains " + myBook.numberOfPages);
     ```   

3. Run the code:
```
> Task :app:run
The title of the book is Going Down Home with Daddy
Its author isStarling Lyons, Daniel Minter
It contains 400
```