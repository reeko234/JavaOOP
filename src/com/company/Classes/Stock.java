package com.company.Classes;


import com.company.Enums.ProductType;

public class Stock extends Product {
    private final ProductType product_type;


    public Stock(String product_id, double product_value) {
        super(product_id, product_value);
        this.product_type = ProductType.STOCK;
    }

}
