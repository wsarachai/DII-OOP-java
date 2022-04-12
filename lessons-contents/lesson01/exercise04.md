## [Lesson01](index.md) > Exercise04:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below:
   ```
   package org.dii.oop;

   import org.dii.oop.lesson01.exercise04.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson.run();
    }
   }
   ```

2. Design your own [`org.dii.oop.lesson01.exercise04.Student`](../../app/src/main/java/org/dii/oop/lesson01/exercise04/Student.java) class with the following requirements.
   * Instance your student object by getting the student attributes from the command line.
     ```
     // Command for getting the input from a keyboard using `Scanner` class
     ...
     import java.util.Scanner;
     ...
     Scanner in = new Scanner(System.in);
     ...
     String inputDate = in.nextLine();
     student.xxxx = inputDate;
     ...
     ```
   * Create a student object one by one and store it in the collection by using the Vector class.
     ```
     ...
     Vector<Student> students = new Vector<>();
     ...
     students.add(student);
     ...
     ```
   * Display all student objects in the collection by using the following code:
     ```
     for (Student student : students) {
       System.out.println("Student xxxx: " + student.xxxx);
       ...
     }
     ```
   * Use the `do-while` loop to run the program until the user decides to exit the program.
   * Note: the java command is useful to your code program.
     ```
     String num = "2";
     if ("2".equals(num)) {
       // do something
     }
     
     do {
       // do something
     } while(!"3".eqals(choice)); // choice is not equals to "3" then exit
     
     do {
       // do something
     
       ...
     
       if ("3".eqals(choice)) {
         break;  // exit the program
       }
     } while(true);
     ```

3. Write the code in class [Lesson](../../app/src/main/java/org/dii/oop/lesson01/exercise04/Lesson.java) of package `org.dii.oop.lesson01.exercise04`. An example of the running program:
```
// suppose your Student class is
class Student {
   String xxxx;
   String yyyy;
}
```
```
> Task :app:run
1. Add new student
2. Display all students
3. exit
Select the number [1-3]: 1

Input the xxxx: value-xxxx
Input the yyyy: value-yyyy
```
```
1. Add new student
2. Display all students
3. exit
Select the number [1-3]: 2

List of student:
    xxxx: value-xxxx, yyyy: value-yyyy
    xxxx: value-xxxx, yyyy: value-yyyy
    xxxx: value-xxxx, yyyy: value-yyyy
    ...
```
