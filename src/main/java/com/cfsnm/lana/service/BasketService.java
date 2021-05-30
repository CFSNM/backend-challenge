package com.cfsnm.lana.service;

import com.cfsnm.lana.model.Basket;
import com.cfsnm.lana.model.BasketPrice;
import com.cfsnm.lana.model.Product;
import com.cfsnm.lana.model.ProductType;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class BasketService implements IBasketService
{
    private List<Basket> baskets = new LinkedList<>();

    private Basket getBasketById(String basketId)
    {
        Basket basket = null;
        for(Basket b : baskets)
        {
            if(basketId.equals(b.getId()))
            {
                basket = b;
                break;
            }
        }

        return basket;
    }

    @Override
    public Basket createBasket(Basket basket)
    {
        Basket newBasket = new Basket();
        newBasket.setProducts(basket.getProducts());
        String newUuid = UUID.randomUUID().toString();
        newBasket.setId(newUuid);
        return newBasket;
    }

    @Override
    public Basket addProductToBasket(String basketId, Product product)
    {
        Basket basket = getBasketById(basketId);
        List<Product> previousProducts = basket.getProducts();
        previousProducts.add(product);
        basket.setProducts(previousProducts);
        return basket;
    }

    @Override
    public BasketPrice getBasketPrice(String basketId)
    {
        Basket basket = getBasketById(basketId);
        List<Product> products = basket.getProducts();
        double basketPrice = 0.0;
        int numberOfPens = 0;
        int numberOfTShirts = 0;
        for(Product product : products)
        {
            ProductType type = product.getProductType();
            switch(type)
            {
                case TSHIRT:
                    numberOfTShirts++;
                    break;
                case PEN:
                    numberOfPens++;
                    break;
            }
            basketPrice += type.getPrice();
        }

        if(numberOfTShirts >= 3)
        {
            basketPrice -= (ProductType.TSHIRT.getPrice() * 0.25 * numberOfTShirts);
        }

        int numberOfFreePens = numberOfPens / 2;
        basketPrice =- (numberOfFreePens * ProductType.PEN.getPrice());
        BasketPrice basketPriceRes = new BasketPrice();
        basketPriceRes.setPrice(basketPrice);
        return basketPriceRes;
    }

    @Override
    public void deleteBasket(String basketId)
    {
        Basket basket = getBasketById(basketId);
        baskets.remove(basket);
    }
}
