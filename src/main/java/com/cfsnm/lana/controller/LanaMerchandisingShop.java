package com.cfsnm.lana.controller;

import com.cfsnm.lana.model.Basket;
import com.cfsnm.lana.model.BasketPrice;
import com.cfsnm.lana.model.Product;
import com.cfsnm.lana.service.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LanaMerchandisingShop
{

    @Autowired
    IBasketService basketService;

    @PostMapping(value = "/baskets")
    public ResponseEntity<Basket> createBasket(@RequestBody Basket basket)
    {
        Basket newBasket = basketService.createBasket(basket);
        return new ResponseEntity<>(newBasket, HttpStatus.CREATED);
    }

    @GetMapping(value = "/baskets/{id}")
    public ResponseEntity<BasketPrice> getBasketPrice(@PathVariable(name = "id", required = true) String basketId)
    {
        BasketPrice basketPrice = basketService.getBasketPrice(basketId);
        return new ResponseEntity<>(basketPrice, HttpStatus.OK);
    }

    @DeleteMapping(value = "/baskets/{id}")
    public ResponseEntity<String> deleteBasket(@PathVariable(name = "id", required = true) String basketId)
    {
        basketService.deleteBasket(basketId);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PutMapping(value = "/baskets/{id}/products")
    public ResponseEntity<Basket> addProductToBasket(@PathVariable(name = "id", required = true) String basketId,
                                     @RequestBody Product product)
    {
        Basket basket = basketService.addProductToBasket(basketId, product);
        return new ResponseEntity<>(basket, HttpStatus.OK);
    }

}
