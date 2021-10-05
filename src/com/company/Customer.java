package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<ShippingAddress> addresses;
    public void addAddress(ShippingAddress newAddress){


    }


    public Customer(String customerName, Integer custID) {
        customerID = custID;
        name = customerName;
    }

    public String getName(){
        return name;

    }

    public int getID(){
        return customerID;

    }
}

