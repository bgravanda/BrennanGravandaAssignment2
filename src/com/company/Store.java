package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;


public class Store<custID, allCustomers> {
    custID = new ArrayList<custID>();
    allCustomers = new ArrayList<Customer>();

    public void runStore() {
        var menuReader = new Scanner(System.in);
        while (true) {
            printMenu();
            var userChoice = menuReader.nextInt();
            switch (userChoice) {
                case 1:
                    System.exit(0);
                case 2:
                    addCustomer(menuReader);
                    break;
                case 3:
                    Optional<Customer> current = selectCustomer(menuReader);
                    if (current.isPresent())
                        ManageCustomerMenu(menuReader, current.get());
                    else
                        System.out.println("No customer exists with that ID");
                    break;
                default:
                    System.out.println("Please choose one of the menu options");

            }
        }
    }
    private void ManageCustomerMenu(Scanner menuReader, Customer currentCustomer) {

        while(true){
            printManageCustomerMenu();
            var customerChoice = menuReader.nextInt();
            switch (customerChoice){
                case 1:
                    makeOrder(menuReader, currentCustomer);
                    break;
                case 2:
                    addAddress(menuReader, currentCustomer);
                    break;
                case 3:
                    return;
            }
        }
    }

    private void addCustomer(Scanner inputReader) {
        System.out.println("What is the new Customer's name:");
        inputReader.nextLine(); //eat the orphan newline from previous nextInt call
        var customerName = inputReader.nextLine();
        //create a custID
        var custID = inputReader.nextInt();
        var newCustomer = new Customer(customerName, custID);
        allCustomers.add(newCustomer);

    }

    private Optional<Customer> selectCustomer(Scanner reader) {
        System.out.println("Customer ID of customer to select");
        var idToFind = reader.nextInt();
        for (var currentCustomer : allCustomers) {
            if (currentCustomer.getID() == idToFind)
                return Optional.of(currentCustomer);
        }
        return Optional.empty();
    }


    private void printMenu() {
        System.out.println("*************************");
        System.out.println("What would you like to do next(select the number):");
        System.out.println("[1] Exit Program");
        System.out.println("[2] add customer");
        System.out.println("[3] Select a customer");
        System.out.println("we'll add more soon");
        System.out.println("********************************");
        System.out.println("Enter choice:");
    }
    private void printManageCustomerMenu(){
        System.out.println("**************************************");
        System.out.println("What do you want to do with this customer?");
        System.out.println("[1] Make an order");
        System.out.println("[2] Add an address");
        System.out.println("[3] Return to main menu");
        System.out.println("**************************");
        System.out.println("Enter Choice:");


    }
}


