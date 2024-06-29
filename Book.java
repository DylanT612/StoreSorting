/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - Book
Description: subclass book inherits from item

 */

// book class extends Item while initializing variables author, edition, publisher, and pubYear
class Book extends Item {
    private String authors;
    private String edition;
    private String publisher;
    private int pubYear;

    // constructor
    public Book(String title, double price, String authors, String edition, String publisher, int pubYear) {
        super(title, price);
        this.authors = authors;
        this.edition = edition;
        this.publisher = publisher;
        this.pubYear = pubYear;
    }
    // setters and getters for authors, edition, publisher, and pubYear
    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    // getType returns book
    @Override
    public String getType() {
        return "book";
    }
}
