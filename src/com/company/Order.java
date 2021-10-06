package com.company;

public class Order {
    private ShippingAddress destination;
    private Customer orderedBy;
    public Order(ShippingAddress dest, Customer orderer){
        destination = dest;
        orderedBy = orderer;

    }
    public Customer getOrderedBy(){
        var order = new Customer(.getName())
        return orderedBy;
    }
    public ShippingAddress getDestination(){
        return destination;
    }

}
