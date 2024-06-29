/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - OnlineStore
Description: OnlineStore contains the main menu and start functions

 */

import java.io.IOException;
import java.util.Scanner;

// class OnlineStore initializes inventory
class OnlineStore {
    private ItemInventory inventory;

    // start method reads file and throws exception if file not found
    public void start() {
        try {
            inventory = ItemInventory.load("items.txt");
            menu();
        } catch (IOException e) {
            System.out.println("Failed to start the store: " + e.getMessage());
        }
    }

    // menu method allows interaction with the user
    private void menu() {
        Scanner scanner = new Scanner(System.in);
        // loop displaying the menu options
        while (true) {
            System.out.println("Welcome to eMart");
            System.out.println("  1) Show all items");
            System.out.println("  2) Show only music CD");
            System.out.println("  3) Show only books");
            System.out.println("  4) Show only software");
            System.out.println("  5) Exit program");
            // prompt user input
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            // if 5 exit program
            if (choice == 5) {
                break;
            }

            // display the header for the output
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-30s %10s %10s %10s\n", "Title", "Type", "Price", "Quantity");
            System.out.println("-----------------------------------------------------------------");
            // iterates through inventory and prints the selected results based on what user inputted
            for (ItemEntry entry : inventory.getItems()) {
                Item item = entry.getItem();

                // output items based on user input
                // if 1 show all items
                if (choice == 1) {
                    System.out.printf("%-30s %10s %10.2f %10d\n", item.getTitle(), item.getType(), item.getPrice(), entry.getQuantity());

                    // if 2 show music
                } else if (choice == 2 && item.getType().equals("music")) {
                    System.out.printf("%-30s %10s %10.2f %10d\n", item.getTitle(), item.getType(), item.getPrice(), entry.getQuantity());

                    // if 3 show books
                } else if (choice == 3 && item.getType().equals("book")) {
                    System.out.printf("%-30s %10s %10.2f %10d\n", item.getTitle(), item.getType(), item.getPrice(), entry.getQuantity());

                    // if 4 show software
                } else if (choice == 4 && item.getType().equals("software")) {
                    System.out.printf("%-30s %10s %10.2f %10d\n", item.getTitle(), item.getType(), item.getPrice(), entry.getQuantity());
                }
            }


            // outputting footer after displaying selected content
            System.out.println("-----------------------------------------------------------------");
        }
    }

}
