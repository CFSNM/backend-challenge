package com.cfsnm.lana.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, code = HttpStatus.NOT_FOUND, reason = "Basket not found.")
public class BasketNotFoundException extends RuntimeException
{
    public BasketNotFoundException(String basketId)
    {
        super("Basket with ID " + basketId + " doesnt exist.");
    }
}
