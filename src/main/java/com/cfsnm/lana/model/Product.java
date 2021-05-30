package com.cfsnm.lana.model;

import java.util.Objects;

public class Product
{
    private ProductType productType;

    public ProductType getProductType()
    {
        return this.productType;
    }

    public void setProductType(ProductType productType)
    {
        this.productType = productType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productType == product.productType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType);
    }
}

