package org.example.model;

import org.example.model.constants.Colour;
import org.example.model.constants.Discount;

public class Apple extends Food implements Discountable {
    private final String colour;
    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public double getDiscount() {
        if (Colour.RED_APPLE.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return Discount.GREEN_APPLE_DISCOUNT;
    }
}
