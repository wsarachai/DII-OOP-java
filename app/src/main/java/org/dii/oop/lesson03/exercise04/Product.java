package org.dii.oop.lesson03.exercise04;

public class Product {
    String code;
    String brand;
    String author;
    String name;
    int shelfLifeInYear;
    int published;
    String taste;
    String type;

    public Product(String code, String author, String name, int published) {
        this.code = code;
        this.author = author;
        this.name = name;
        this.published = published;
        this.type = "book";
    }

    public Product(String code, String brand, String name, String taste) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.taste = taste;
        this.type = "food";
    }
}
