package com.coffeeshop.naive;
 
public class OrderProcessor {
 
    private final TaxCalculator taxCalculator;
    private final ReceiptPrinter receiptPrinter;
    private final OrderRepository orderRepository;
 
    public OrderProcessor() {
        this.taxCalculator = new TaxCalculator();
        this.receiptPrinter = new ReceiptPrinter();
        this.orderRepository = new OrderRepository();
    }
 
    public void processOrder(String customerName, String coffeeType, double basePrice) {
        System.out.println("[System] Calculating final totals...");
 
        Order order = new Order(customerName, coffeeType, basePrice);
        double finalPrice = taxCalculator.calculateFinalPrice(basePrice);
 
        receiptPrinter.printReceipt(order, finalPrice);
        orderRepository.save(order, finalPrice);
    }
}
 