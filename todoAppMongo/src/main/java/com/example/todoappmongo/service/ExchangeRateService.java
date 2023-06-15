package com.example.todoappmongo.service;

import com.example.todoappmongo.model.ExchangeRate;
import com.example.todoappmongo.repository.ExchangeRateRepository;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {
    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateService(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    public String findByCurrency(String baseCurrency) {
        ExchangeRate exchangeRate = exchangeRateRepository.findByBaseCurrency(baseCurrency);

        return "El cambio del dia es: " + exchangeRate;
    }

    public double convertCurrency(double amount, String baseCurrency) {

        ExchangeRate exchangeRate = exchangeRateRepository.findByBaseCurrency(baseCurrency);
        if (exchangeRate != null) {
            return amount * exchangeRate.getExchangeRate();
        } else {
            throw new IllegalArgumentException("Moneda base es invalida bro.");
        }
    }
}
