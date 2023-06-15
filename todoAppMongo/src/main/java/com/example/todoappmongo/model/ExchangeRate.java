package com.example.todoappmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "exchange")
@Data
public class ExchangeRate {
    @Id
    private String id;
    @Field("base_currency")
    private String baseCurrency;
    @Field("exchange_rate")
    private double exchangeRate;
}
