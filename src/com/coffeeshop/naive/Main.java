/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Naive Coffee Shop System ===");
        
        OrderProcessor processor = new OrderProcessor();
        Scanner scanner = new Scanner(System.in);

boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("\n--- New Order ---");
 
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();
 
            System.out.print("Coffee Item: ");
            String coffeeType = scanner.nextLine();
 
            double basePrice = 0.0;
            boolean validPrice = false;
            while (!validPrice) {
                System.out.print("Base Price (PHP): ");
                String priceInput = scanner.nextLine();
                try {
                    basePrice = Double.parseDouble(priceInput);
                    validPrice = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number for the price.");
                }
            }
 
            processor.processOrder(customerName, coffeeType, basePrice);
 
            System.out.print("Process another order? (y/n): ");
            String again = scanner.nextLine().trim().toLowerCase();
            keepGoing = again.equals("y") || again.equals("yes");
        }
 
        scanner.close();
        System.out.println("\n=== Order Processing Complete ===");
    }
}
    