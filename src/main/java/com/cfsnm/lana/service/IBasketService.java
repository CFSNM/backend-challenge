package com.cfsnm.lana.service;

import com.cfsnm.lana.model.Basket;
import com.cfsnm.lana.model.BasketPrice;
import com.cfsnm.lana.model.Product;

public interface IBasketService
{
    public Basket createBasket(Basket basket);

    public Basket addProductToBasket(String basketId, Product product);

    public BasketPrice getBasketPrice(String basketId);

    public void deleteBasket(String basketId);
}
