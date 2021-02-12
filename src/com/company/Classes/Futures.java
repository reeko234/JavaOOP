package com.company.Classes;

import com.company.Enums.ProductType;

public class Futures extends Product{
    private final ProductType product_type;

    public Futures(String product_id, double product_value) {
        super(product_id, product_value);
        this.product_type = ProductType.FUTURES;
    }
}
