package com.company;

import java.util.Scanner;

public class ShippingAddress {
    private String AddressLine1;
    private String State;
    private String City;
    private String PostalCode;

    public ShippingAddress(Scanner inputReader) {
        inputReader.nextLine();
        System.out.println("What is the address?");
        AddressLine1 = inputReader.nextLine();
        System.out.println("what is the city?");
        City = inputReader.nextLine();
        System.out.println("What is the state?");
        State = inputReader.nextLine();
        System.out.println("what is the postal code?");
        PostalCode = inputReader.nextLine();
    }
}
