package com.jason.factory;

public class ProductFactory {

    public static Product createProduct(Class c) {
        try {
            Product product = (Product)Class.forName(c.getName()).newInstance();
            return product;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
