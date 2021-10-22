package com.company;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public abstract class Customer {
    private int customerID;
    private String name;
    private ArrayList<ShippingAddress> addresses;
    public abstract double payForOrder(ArrayList<merchandiseItem> itemsInOrder);

    public void addAddress(ShippingAddress newAddress){
        addresses.add(newAddress);


    }


    public Customer(String customerName, Integer custID) {
        customerID = custID;
        name = customerName;
        addresses = new ArrayList<ShippingAddress>();
    }

    public String getName(){
        return name;

    }

    public int getID(){
        return customerID;

    }
    public ShippingAddress  SelectAddress(Scanner Select){
        for(var location: addresses) {
            System.out.println(location);
        }
            System.out.println("Select an address starting with 0");
        var Input = Select.nextInt();
        var addy = addresses.get(Input);
        return addy;
    }

    public String toString() {
        return customerID+" "+name;
    }
    public double payOutstandingBalance(){
        return 0.0;
    }
    public void arrangeDelivery(){
        System.out.println(name+"'s order will be delivered any time");
    }


}

