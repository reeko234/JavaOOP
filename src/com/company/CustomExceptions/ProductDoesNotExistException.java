package com.company.CustomExceptions;

public class ProductDoesNotExistException extends Exception{
    public ProductDoesNotExistException(String message) {
        super(message);
    }
}
