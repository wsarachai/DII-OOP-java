## [Lesson04](index.md) > Exercise01:

1. Open class [App](../../app/src/main/java/org/dii/oop/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson04.exercise01.Lesson;

   public class App {
     public static void main(String[] args) {
       Lesson lesson = new Lesson();
       lesson.start();
    }
   }
   ```

2. Edit class [Lesson](../../app/src/main/java/org/dii/oop/lesson04/exercise01/Lesson.java) in package `org.dii.oop.lesson04.exercise01` and follow the instructions below:
   - Write the car parking program, with the requirements below:
     * The cost of parking a car is 20 baths per hour.
     * The program starts by displaying the menu as shown below:
       ```
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]:
       ```
     * The program will issue the receipt when the customer comes to withdraw their car. By choosing menu number 3, the program will display all of receipts. The example of data is shown below:
       ```
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 3

       List receipt:
           Receipt number: R-1001, Plate number: abc-100, Customer name: Cus1
           Receipt number: R-1002, Plate number: xyz-200, Customer name: Cus2
       ```
       However, for the first time, the program must display the content as shown below:
       ```
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 3

       List of receipt:
           No receipt...
       ```
       It is also the same behavior, for the first time for choosing menu number 2.
       ```
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 2

       Empty data ...
       ```
     * An example of car deposit:
       ```
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 1
       
       Enter the plate number: abc-100
       Enter the customer name: Cus1
       
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 1
       
       Enter the plate number: xyz-200
       Enter the customer name: Cus2
       
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 3
       
       List receipt:
           Receipt number: R-1001, Plate number: abc-100, Customer name: Cus1
           Receipt number: R-1002, Plate number: xyz-200, Customer name: Cus2
       ```
     * An example of car withdraw:
       ```
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 2
       
       Enter the plate number: xyz-200
       Enter the number of hours: 10

       Receipt deposit date: Mon Apr 04 16:39:14 ICT 2022
       Receipt receipt date: Mon Apr 04 16:47:12 ICT 2022
       Receipt number: R-1002
       Payment total: 200.0
       
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]: 3
       
       List receipt:
           Receipt number: R-1001, Plate number: abc-100, Customer name: Cus1
       
       1. deposit
       2. issued receipt
       3. display all receipt
       4. exit
       Enter the method [1-4]:        
       ```

3. The program must include the Receipt class for the receipt issued to the customer.
   ```
   class Receipt {
     /* access modifier */ double costPerHour = 20.0;    // is a static used for all receipts
     /* access modifier */ int latestReceiptNumber = 0;  // is static and used to keep the latest receipt number used to create a new receipt
     /* access modifier */ String receiptNumber;         // the receipt number, read-only attribute
     /* access modifier */ String plateNumber;           // the plate number, read-only arrribute
     /* access modifier */ String customerName;          // the customer name, read-only arrribute
     /* access modifier */ Date depositDate;             // the date of deposit, read-only arrribute
     /* access modifier */ Date receiptDate;             // the date of receipt, read-write arrribute
     /* access modifier */ int hours;                    // the hour spent on car parking, write-only attribute
   ...
   }
   ```
   Note:
     * Access modifier: static, private, protected, public, ...
     * You have to define the correct access modifier of each attribute by yourself.
     * You have to define the encapsulation behavior of the Receipt class to meet the requirement. (Read-only, Read-write, and Write-only of the class attributes)
