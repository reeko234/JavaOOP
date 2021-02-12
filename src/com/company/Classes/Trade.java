package com.company.Classes;

import com.company.CustomExceptions.ProductAlreadyRegisteredException;
import com.company.Interfaces.MontrealTradedProducts;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

public class Trade implements MontrealTradedProducts {
    private int quantity;
    private List<Product> registered_products = new ArrayList<Product>();
    private List<TradedProduct> traded_products = new ArrayList<TradedProduct>();
    private List<Integer> traded_quantity = new ArrayList<>();

    @Override
    public Executable addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        try{
            if(!registered_products.contains(product)){
                registered_products.add(product);
            }
        }catch(Exception e){
            throw new ProductAlreadyRegisteredException("Product already exist");
        }
        return null;
    }

    @Override
    public void trade(Product product, int quantity){
        if (registered_products.contains(product)){
            TradedProduct tp = new TradedProduct(product,quantity);
            traded_products.add(tp);
            traded_quantity.add(quantity);
        }
        else{
            System.out.println("Product not registered");
        }
    }

    @Override
    public int totalTradeQuantityForDay() {
        int sum=0;
        for (int q:traded_quantity){
            sum +=q;
        }
        return sum;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double total_value = 0.0;
        for(TradedProduct tp:traded_products){
            total_value= tp.product.product_value*tp.quantity;
        }
        return total_value;
    }
    public List<Product> getTradedProducts(){
        return registered_products;
    }
}
