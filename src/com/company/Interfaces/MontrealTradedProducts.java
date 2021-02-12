package com.company.Interfaces;

import com.company.Classes.Product;
import com.company.CustomExceptions.ProductAlreadyRegisteredException;
import org.junit.jupiter.api.function.Executable;

public interface MontrealTradedProducts {
    Executable addNewProduct(Product product) throws ProductAlreadyRegisteredException;

    void trade(Product product, int quantity);

    int totalTradeQuantityForDay();


    double totalValueOfDaysTradedProducts();
}
