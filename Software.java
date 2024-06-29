/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - Software
Description: subclass Software inherits from item

 */

// class Software inherits from Item and initializes its own variable version
class Software extends Item {
    private String version;

    // constructor
    public Software(String title, double price, String version) {
        super(title, price);
        this.version = version;
    }

    // setter and getter for version
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    // getType returns software
    @Override
    public String getType() {
        return "software";
    }

}

