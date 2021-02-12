package com.company;

import com.company.Classes.Futures;
import com.company.Classes.Product;
import com.company.Classes.Stock;
import com.company.Classes.Trade;
import com.company.CustomExceptions.ProductAlreadyRegisteredException;

import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ProductAlreadyRegisteredException {
	// write your code here
        Stock stock;
        Trade trade = new Trade();
        Futures future;

        stock = new Stock("0909",100.9);
        trade.addNewProduct(stock);
          future = new Futures("3940",200.0);
          trade.addNewProduct(future);
        System.out.println(trade.getTradedProducts());

    }
}
