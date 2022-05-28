package com.janadev.microservices.currencyexchangeservice.controllers;

import com.janadev.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.janadev.microservices.currencyexchangeservice.repositories.CurrencyExchangeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @Autowired
    CurrencyExchangeRepository currencyExchangeRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(CurrencyExchangeController.class);

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to){

        LOGGER.info("retriveExchangeValue called with {} to {}",from,to);
        CurrencyExchange currencyExchange= currencyExchangeRepository.findByFromAndTo(from,to);
        if(currencyExchange==null){
            throw  new RuntimeException("Unable to find the data");
        }
        String port =environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return  currencyExchange;
    }
}
