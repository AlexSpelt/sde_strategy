package com.hz.sale;

import com.hz.Customer;
import products.Product;

public class NoSale implements Sale {

    private final Customer customer;

    public NoSale(Customer customer) {
        this.customer = customer;
    }

    @Override
    public float calcDiscount() {
        float discount = this.customer.isRegular() ?  .15f : 0;

        return 1 - discount;
    }

}
