package com.coffeeshop.naive;
 
/**
 * Responsible only for formatting and displaying receipts.
 */
public class ReceiptPrinter {
 
    public void printReceipt(Order order, double finalPrice) {
        System.out.println("\n===== COFFEE SHOP RECEIPT =====");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Beverage: " + order.getCoffeeType());
        System.out.println("Total Amount (incl. Tax): PHP " + finalPrice);
        System.out.println("================================\n");
    }
}
 