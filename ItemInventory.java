/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - ItemInventory
Description: ItemInventory object manages all items in the store

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ItemInventory initializes the list to hold items in inventory
class ItemInventory {
    private List<ItemEntry> items;

    // constructor
    private ItemInventory() {
        items = new ArrayList<>();
    }

    // creates an ItemInventory object and populates it with data from the file
    public static ItemInventory load(String file) throws IOException {
        // new object to hold items
        ItemInventory inventory = new ItemInventory();

        try (Scanner scanner = new Scanner(new File(file))) {
            // loop through each line in the file
            while (scanner.hasNextLine()) {
                // reads line and splits on |
                String line = scanner.nextLine();
                String[] fields = line.split("\\|");
                // gets type of item (first segment up to |)
                String type = fields[0];
                // since every item has quantity, price, and item initialize those variables for the object
                Item item = null;
                int quantity = Integer.parseInt(fields[fields.length - 1]);
                double price = Double.parseDouble(fields[fields.length - 2]);
                // if type is book create book object
                if (type.equals("book")) {
                    item = new Book(fields[1], price, fields[2], fields[3], fields[4], Integer.parseInt(fields[5]));
                // if type is music create music object
                } else if (type.equals("music")) {
                    item = new MusicCD(fields[1], price, fields[2], fields[3], fields[4], fields[5], Integer.parseInt(fields[6]), fields[7]);
                // if type is software create software object
                } else if (type.equals("software")) {
                    item = new Software(fields[1], price, fields[2]);
                }
                // adds the item to inventory
                if (item != null) {
                    inventory.items.add(new ItemEntry(item, quantity));
                }
            }
            // if file not found throws an error
        } catch (FileNotFoundException e) {
            throw new IOException("File not found: " + file, e);
        }
        // returns the inventory object
        return inventory;
    }

    // gets all items from inventory
    public List<ItemEntry> getItems() {
        return items;
    }

}
