package com.company;

import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{

    public TaxExemptCustomer(String customerName, Integer custID) {
        super(customerName, custID);
    }

    @Override
    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder) {
        int sum = 0;
        for (var item : itemsInOrder){
            sum += item.getPrice();

        }
        return sum;
    }

    @Override
    public void arrangeDelivery() {
        super.arrangeDelivery();
        System.out.println("contact "+getName()+" on day of delivery");
    }
}
