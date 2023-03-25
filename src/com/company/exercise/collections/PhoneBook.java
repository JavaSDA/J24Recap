package com.company.exercise.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new TreeMap<>();

        while(true) {
            System.out.println("Phone Book App");
            System.out.println("Menu");

            System.out.println("1. Add Contact");
            System.out.println("2. Find Contact by Name");
            System.out.println("3. List Contacts");
            System.out.println("4. Exit");

            System.out.println(); // space

            // Add a prompt to tell the user to select a menu item
            System.out.print("Enter a menu option(number): ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the contact's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter contact's phone: ");
                    String phone = scanner.nextLine();
                    phoneBook.put(name, phone);
                    System.out.println("Contact added: " + name + " (" + phone + ")\n");
                    break;
                case 2:
                    System.out.print("Enter the contact's name: ");
                    name = scanner.nextLine();
                    phone = phoneBook.get(name); // Use the name entered to retrieve the number
                    if (phone == null) {
                        System.out.println("Contact not found: " + name + "\n");
                    } else {
                        System.out.println("Contact retrieved: " + name + "( " + phone + ")\n");
                    }
                    break;
                case 3:
                    System.out.println("Contacts: ");
                    // Print out all contacts in the phonebook
                    for (String contactName : phoneBook.keySet()) {
                        phone = phoneBook.get(contactName);
                        System.out.println(contactName + " (" + phone + ")\n");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0); // Terminate the program
                default:
                    System.out.println("Invalid menu option");
            }
        }
    }
}
