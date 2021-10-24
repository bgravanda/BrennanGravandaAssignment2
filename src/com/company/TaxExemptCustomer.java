package com.company;

import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{

    public TaxExemptCustomer(String customerName, Integer custID) {
        super(customerName, custID);
    }

    @Override
    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder) {
        for (cart : ArrayList<merchandiseItem>){
            var sum = ;



        }


    }

    @Override
    public void arrangeDelivery() {
        super.arrangeDelivery();
        System.out.println("contact "+getName()+" on day of delivery");
    }
}
