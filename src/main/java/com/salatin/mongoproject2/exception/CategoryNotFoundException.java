package com.salatin.mongoproject2.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String id) {
        super("not found" + id);
    }
}
