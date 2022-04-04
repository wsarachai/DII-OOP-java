package org.dii.oop.lesson04.exercise01;

import java.util.Date;

public class Receipt {
    private static final double costPerHour = 20.0;
    private static int latestReceiptNumber = 0;
    private final String receiptNumber;
    private final String plateNumber;
    private final String customerName;
    private final Date depositDate;
    private Date receiptDate;
    private int hours;

    private static String generateReceiptNumber() {
        latestReceiptNumber++;
        return String.format("R-%04d", 1000 + latestReceiptNumber);
    }

    public Receipt(String plateNumber, String customerName) {
        this.receiptNumber = generateReceiptNumber();
        this.depositDate = new Date();
        this.plateNumber = plateNumber;
        this.customerName = customerName;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date date) {
        receiptDate = date;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPaymentTotal() {
        return hours * costPerHour;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
