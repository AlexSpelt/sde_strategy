package com.hz.sale;

import products.Product;

public class ChristmasSale implements Sale {

    private final int index;

    public ChristmasSale(int index) {
        this.index = index;
    }

    @Override
    public float calcDiscount() {
        float discount = this.index == 0 ? .2f : .125f;

        return 1 - discount;
    }

}
