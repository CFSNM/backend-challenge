package com.cfsnm.lana.model;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Basket {

    private String id;
    private List<Product> products;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public List<Product> getProducts()
    {
        if(products == null)
            products = new LinkedList<>();
        return products;
    }

    public void setProducts(List<Product> products)
    {
        this.products.clear();
        this.products.addAll(products);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(id, basket.id) && Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }
}
