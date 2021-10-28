package com.company;

import java.util.ArrayList;

public class ResidentialCustomer extends Customer {
    public ResidentialCustomer(String customerName, Integer custID) {
        super(customerName, custID);
    }

    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder) {
        int sum = 0;
        for (var item : itemsInOrder) {
            if ( )
            sum += item.getPrice();

        }
        return sum;
    }
}