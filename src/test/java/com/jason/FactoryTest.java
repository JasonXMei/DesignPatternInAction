package com.jason;

import com.jason.factory.Product;
import com.jason.factory.ProductA;
import com.jason.factory.ProductFactory;
import com.jason.template.OrderCreateFlow;
import com.jason.template.OrderCreateWithEmailNotify;
import com.jason.template.OrderCreateWithSMSNotify;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void testFactory() {
        Product product = ProductFactory.createProduct(ProductA.class);
        product.method();
    }

}
