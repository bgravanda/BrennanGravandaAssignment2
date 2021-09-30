package com.company;

import java.util.Optional;
import java.util.Scanner;

public class Store {


    public void runStore() {
        var menuReader = new Scanner(System.in);
        while (true) {
            printMenu();
            var userChoice = menuReader.nextInt();
            switch (userChoice){
                case 1:
                    System.exit(0);
                case 2:
                    addCustomer(menuReader);
                    break;
                case 3:
                    Optional<Customer> current = selectCustomer(menuReader);
                    if(current.isPresent())
                        doCustomerMenu(menuReader, current.get());
                    else
                        System.out.println("No customer exists with that ID");
                    break;
                default:
                    System.out.println("Please choose one of the menu options");

            }
        }
    }

    private void addCustomer(Scanner menuReader) {

    }

    private void doCustomerMenu(Scanner menuReader, Customer customer) {
    }
    private Optional<Customer> selectCustomer(Scanner reader) {


    }
    return Optional.empty();


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
}


