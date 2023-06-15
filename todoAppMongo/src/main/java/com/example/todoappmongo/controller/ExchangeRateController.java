package com.example.todoappmongo.controller;

import com.example.todoappmongo.service.ExchangeRateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ExchangeRateController {
    private final ExchangeRateService exchangeRateService;

    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping("/{base}")
    public String getByBaseCurrency(@PathVariable String base) {
        return exchangeRateService.findByCurrency(base);
    }

    @GetMapping("/{base}")
    public double convertCurrency(@PathVariable String base, @RequestParam("amount") double amount) {
        return exchangeRateService.convertCurrency(amount, base);
    }
}
