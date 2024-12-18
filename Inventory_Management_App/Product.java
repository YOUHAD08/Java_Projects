package com.oop.projects.Inventory_Management_App;

public class Product {
    private int code;
    private String name;
    private double price;
    private int quantity;

    Product(){
        this(0,"None",0,0);
    }

    Product(int code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return String.format("|%-20s|%-20s|%-20s|%-20s|%n", code, name, price, quantity);
    }
}
