package com.cfsnm.lana.model;

import java.util.List;

public class Basket {

    private String id;
    private List<Product> products;

    private String getId()
    {
        return id;
    }

    private void setId(String id)
    {
        this.id = id;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(List<Product> products)
    {
        this.products.clear();
        this.products.addAll(products);
    }
}
