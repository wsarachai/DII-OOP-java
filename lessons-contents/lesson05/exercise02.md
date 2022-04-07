## [Lesson05](index.md) > Exercise01:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson05.exercise02.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson.run();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson05/exercise02/Lesson.java) in package `org.dii.oop.lesson05.exercise02` and follow the instructions below:
   - Create the program to register the trainee in the topic "Object-oriented programing concept". The course accepts different trainees such as a student, university staff, and general people. The program acquires the information from the trainee according to their own role as shown below:
     1. Student including `name`, `email`, `studentID`, and `major`.
     2. University staff including `name`, `email`, and `position`. 
     3. General people including `name`, `email`, and `occupation`.
   - This work tests your knowledge of inheritance. In your solution, design the classes to have superclass and subclass.


3. The output of the program:
   ```
   1. Register
   2. List trainee
   3. exit
   Please select [1-3]: 1
   
   >> Register new trainee
   1. Student
   2. University staff
   3. General people
   4. Go to main menu
   Please select [1-4]: 1
   
   >>> Enter name: Stu1
   >>> Enter email: stu1@cmu.ac.th
   >>> Enter student ID: 1234567890
   >>> Enter major: DII
   ```
   ```
   1. Register
   2. List trainee
   3. exit
   Please select [1-3]: 1
   
   >> Register new trainee
   1. Student
   2. University staff
   3. General people
   4. Go to main menu
   Please select [1-4]: 2
   
   >>> Enter name: Staff1
   >>> Enter email: staff1@cmu.ac.th
   >>> Enter position: networking
   ```
   ```
   1. Register
   2. List trainee
   3. exit
   Please select [1-3]: 1
   
   >> Register new trainee
   1. Student
   2. University staff
   3. General people
   4. Go to main menu
   Please select [1-4]: 3
   
   >>> Enter name: John
   >>> Enter email: john@xxx.com
   >>> Enter occupation: researcher
   ```
   ```
   1. Register
   2. List trainee
   3. exit
   Please select [1-3]: 2
   
   >> List trainee
   - Name: Stu1, Email: stu1@cmu.ac.th, StudentID: 1234567890, Major: DII
   - Name: Staff1, Email: staff1@cmu.ac.th, Position: networking
   - Name: John, Email: john@xxx.com, Occupation: researcher
   ```
   