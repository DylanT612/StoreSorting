/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - ItemEntry
Description: ItemEntry gets the item and quantity from ItemInventory

 */

// class ItemEntry initializes item and quantity
class ItemEntry {
    private Item item;
    private int quantity;


    // constructor
    public ItemEntry(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // setters and getters for item and quantity
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

