package org.dii.oop.lesson04.exercise01;

import java.util.Date;

public class Receipt {
    final double costPerHour = 20.0;
    int latestReceiptNumber = 0;
    String receiptNumber;
    String plateNumber;
    String customerName;
    Date depositDate;
    Date receiptDate;
    int hours;

    private static String generateReceiptNumber() {
        return "";
    }

    public Receipt(String plateNumber, String customerName) {
        this.receiptNumber = generateReceiptNumber();
        this.depositDate = new Date();
        this.plateNumber = plateNumber;
        this.customerName = customerName;
    }

}
