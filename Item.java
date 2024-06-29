/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - Item
Description: superclass item parent class for book, musicCD, and software

 */

// item class has two private variables title and price
abstract class Item {
    private String title;
    private double price;

    // constructor
    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // getters and setters for title and price
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    // getType makes each subclass return the type of item
    public abstract String getType();

}
