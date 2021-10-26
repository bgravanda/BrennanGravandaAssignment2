package com.company;

import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{

    public TaxExemptCustomer(String customerName, Integer custID) {
        super(customerName, custID);
    }

    @Override
    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder) {
        var sum = new Int;
        for (var item : itemsInOrder){

        }
    }

    @Override
    public void arrangeDelivery() {
        super.arrangeDelivery();
        System.out.println("contact "+getName()+" on day of delivery");
    }
}
