package org.example;

public class DiscountService {

    public String getDiscount(int amount) {
        String discount = "";
        if (amount > 5000 && amount < 10000) discount = "10%";
        else if (amount > 10000) discount = "15%";
        else discount = "NA";
        return discount;
    }
}
