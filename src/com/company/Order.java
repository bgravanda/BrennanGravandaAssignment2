package com.company;

public class Order {
    private ShippingAddress destination;
    private Customer orderedBy;
    public Order(ShippingAddress dest, Customer orderer){
        destination = dest;
        orderedBy = orderer;

    }
    public String getOrderedBy(){
        var newOrder = orderedBy.toString();
        return newOrder;
    }
    public String getDestination(){
        var newDestination=destination.toString();
        return newDestination;
    }

}
