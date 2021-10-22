package com.company;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;


public class Store {

    private ArrayList<Order> allOrders;
    private ArrayList<Customer> allCustomers;
    private static int nextID = 1005;
    private ArrayList<merchandiseItem>allItems;
    private ArrayList<ItemType>allItemTypes;




    public Store() throws IOException {
        allOrders = new ArrayList<Order>();
        allCustomers = new ArrayList<Customer>();
        var filename = "Customers.txt";
        var filePath = Paths.get(filename);
        var allLines = Files.readAllLines(filePath);
        for (var line : allLines) {
            var splitLine = line.split(",");
            var customerName = splitLine[0];
            var customerID = Integer.parseInt(splitLine[1]);
            var customerType = splitLine[2];
            if (customerType== "ResidentialCustomer") {
                var newCustomer = new ResidentialCustomer(customerName, customerID);
                allCustomers.add(newCustomer);
            }
            else (customerType=="BusinessCustomer"){
                var newCustomer = new BusinessCustomer(customerName, customerID);
                allCustomers.add(newCustomer);
            }
            else (customerType=="TaxExemptCustomer"){
                var newCustomer = new TaxExemptCustomer(customerName,customerID);
                allCustomers.add(newCustomer);
            }

        }
        allItems = new ArrayList<merchandiseItem>();
        allItemTypes = new ArrayList<ItemType>();
        var filename2 = Paths.get(filename);
        var allLines2 = Files.readAllLines(filePath);
        for ( var line : allLines2){
            var splitLine = line.split(",");
            var itemName = splitLine[0];
            var itemType = splitLine[1];
            var itemPrice = splitLine[2];
        }

    }

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

        while (true) {
            printManageCustomerMenu(currentCustomer);
            var customerChoice = menuReader.nextInt();
            switch (customerChoice) {
                case 1:
                   makeOrder(currentCustomer, menuReader);
                    break;
                case 2:
                    var shipping = new ShippingAddress(menuReader);
                    currentCustomer.addAddress(shipping);
                    System.out.println(currentCustomer.getName()+" has an address of "+shipping.getAddress());
                    break;
                case 3:
                    return;
            }
        }
    }

    private void makeOrder(Customer CustOrder, Scanner Input) {
        Input.nextLine();
        var custadd=CustOrder.SelectAddress(Input);
        System.out.println(custadd.toString());
        Input.nextLine();
        var currentOrder = new Order(custadd, CustOrder);
        System.out.println(currentOrder.getOrderedBy()+"'s order will be sent to "+currentOrder.getDestination());



    }


    private void addCustomer(Scanner inputReader) {
        System.out.println("What is the new Customer's name:");
        inputReader.nextLine();
        var customerName = inputReader.nextLine();
        System.out.println("Are you a Tax Exempt Customer,Residential Customer, or Business Customer");
        var type = inputReader.nextLine();
        var custID = nextID;
        nextID++;
        System.out.println(customerName+" has an ID of "+custID);
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

    private void printManageCustomerMenu(Customer currentCustomer) {
        System.out.println("**************************************");
        System.out.println("What do you want to do with "+currentCustomer.getName()+" ?");
        System.out.println("[1] Make an order");
        System.out.println("[2] Add an address");
        System.out.println("[3] Return to main menu");
        System.out.println("**************************");
        System.out.println("Enter Choice:");


    }
}




