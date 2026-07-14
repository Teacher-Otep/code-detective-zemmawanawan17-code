package com.coffeeshop.naive;
 
/**
 * Responsible only for pricing/tax calculations.
 */
public class TaxCalculator {
 
    private static final double VAT_RATE = 0.12; // 12% VAT
 
    public double calculateFinalPrice(double basePrice) {
        return basePrice + (basePrice * VAT_RATE);
    }
}
 
