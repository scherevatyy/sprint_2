package org.example.service;

import org.example.model.Food;
import org.example.model.Discountable;


public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }
    public double getTotalWithDiscount() {
        double sum = 0;
        for (Food item : items) {
            double discount = ((Discountable) item).getDiscount();
            double itemPrice = item.getPrice() * item.getAmount();
            sum += itemPrice * (1 - discount / 100);
        }
        return sum;
    }
    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getPrice() * item.getAmount();
            }
        }
        return total;
    }

}
