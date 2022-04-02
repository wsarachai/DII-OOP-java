package org.dii.oop.lesson03.examples;

public class Customer {
    public String name;
    public int numOfOrder;
    public String address;

    // default constructor of the class
    public Customer() {
        // this will call the constructor with String param
        this("Chaitanya");
    }

    public Customer(String name) {
        // call the constructor with (String, int) param
        this(name, 1200);
    }

    public Customer(String name, int orders) {
        // call the constructor with (String, int, String) param
        this(name, orders, "Gurgaon");
    }

    public Customer(String name, int orders, String addr) {
        this.name = name;
        this.numOfOrder = orders;
        this.address = addr;
    }

    void disp() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Salary: " + numOfOrder);
        System.out.println("Customer Address: " + address);
    }

    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.disp();
    }
}
