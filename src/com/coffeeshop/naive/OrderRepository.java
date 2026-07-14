package com.coffeeshop.naive;
 
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * Responsible only for persisting orders to storage.
 */
public class OrderRepository {
 
    private static final String LOG_FILE = "orders_log.txt";
 
    /**
     * Saves the order transaction to disk.
     * @return true if the save succeeded, false otherwise.
     */
    public boolean save(Order order, double finalPrice) {
        System.out.println("[System] Saving transaction logs to disk...");
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write("Customer: " + order.getCustomerName()
                    + " | Item: " + order.getCoffeeType()
                    + " | Total: " + finalPrice + "\n");
            System.out.println("[Database] Log successfully written to " + LOG_FILE);
            return true;
        } catch (IOException e) {
            System.out.println("[CRITICAL ERROR] Failed to write to file system: " + e.getMessage());
            return false;
        }
    }
}
