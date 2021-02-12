package com.company.Tests;

import com.company.Classes.Futures;
import com.company.Classes.Product;
import com.company.Classes.Stock;
import com.company.Classes.Trade;
import com.company.CustomExceptions.ProductAlreadyRegisteredException;
import com.company.Interfaces.ProductPricingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class TradeTest {
    Product product;
    ProductPricingService ppservice;
    Stock stock;
    Futures future;
    Trade trade;

    @BeforeEach
    void setUp() {
        ppservice = mock(ProductPricingService.class);
        stock = stock = new Stock("0909",100.9);
        future = new Futures("124future",1000.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addNewProductTest() throws ProductAlreadyRegisteredException {
        assertThrows(ProductAlreadyRegisteredException.class,trade.addNewProduct(stock));
    }

    @Test
    void tradeTest() {

    }

    @Test
    void totalTradeQuantityForDay() {
    }

    @Test
    void totalValueOfDaysTradedProducts() {
    }
}