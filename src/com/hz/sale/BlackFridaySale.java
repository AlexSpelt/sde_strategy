package com.hz.sale;

import products.Product;

public class BlackFridaySale implements Sale {

    @Override
    public float calcDiscount() {

        return 1 - 0.8f;

    }

}
