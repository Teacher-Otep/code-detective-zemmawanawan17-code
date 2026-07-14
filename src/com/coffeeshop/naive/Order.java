package com.coffeeshop.naive;
 
/**
 * Represents a single coffee shop order.
 * Pure data holder — no business logic, printing, or persistence here.
 */
public class Order {
 
    private final String customerName;
    private final String coffeeType;
    private final double basePrice;
 
    public Order(String customerName, String coffeeType, double basePrice) {
        this.customerName = customerName;
        this.coffeeType = coffeeType;
        this.basePrice = basePrice;
    }
 
    public String getCustomerName() {
        return customerName;
    }
 
    public String getCoffeeType() {
        return coffeeType;
    }
 
    public double getBasePrice() {
        return basePrice;
    }
}
 
