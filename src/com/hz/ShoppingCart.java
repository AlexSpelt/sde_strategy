package com.hz;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    public double getTotalPrice(SalesAction salesAction, Customer customer) {

        double totalPrice = 0.0;

        for(Product product : this) {

            int index = this.indexOf(product);

            DiscountCalculator discountCalculator = new DiscountCalculator(customer, index);
            discountCalculator.setStrategy(salesAction);

            double discount = discountCalculator.getDiscount();
            double price = product.getPrice() * discount;

            totalPrice += price;
        }

        return totalPrice;
    }
}