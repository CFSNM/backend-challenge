package com.cfsnm.lana.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Basket {

    private String id;
    private String name;
    private List<Product> products;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return Objects.equals(id, basket.id) && Objects.equals(products, basket.products) && Objects.equals(name, basket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, products);
    }

    @Override
    public String toString()
    {
        return "Basket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
