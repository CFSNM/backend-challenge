package com.cfsnm.lana.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketServiceTest {

    BasketService basketService;

    @BeforeEach
    void setUp()
    {
        basketService = new BasketService();
    }

    @AfterEach
    void tearDown()
    {
        basketService = null;
    }

    @Test
    void createBasket()
    {

    }

    @Test
    void addProductToBasket() {
    }

    @Test
    void getBasketPrice() {
    }

    @Test
    void deleteBasket() {
    }
}