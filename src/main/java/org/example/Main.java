package org.example;

import org.example.model.*;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED_APPLE);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_APPLE);

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: %.1f%n", cart.getTotalWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.1f%n", cart.getTotalWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.1f%n", cart.getTotalVegetarianWithoutDiscount());
    }
}