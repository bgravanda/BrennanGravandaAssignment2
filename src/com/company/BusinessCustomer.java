package com.company;

import java.util.ArrayList;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;
    private int PersonID;
    private String CustName;

    public BusinessCustomer(String customerName, Integer custID) {
        super(customerName, custID);
    }

    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder){

    }
    public void arrangeDelivery(){

        System.out.println("this order will be for "+getName()+" and it will be payed with a purchase order");
    }
}