package com.example.todoappmongo.repository;


import com.example.todoappmongo.model.ExchangeRate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExchangeRateRepository extends MongoRepository<ExchangeRate, String> {
    ExchangeRate findByBaseCurrency(String baseCurrency);
}
