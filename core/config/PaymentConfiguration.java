package com.apoiacafe.paypamentsapi.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class PaymentConfiguration {

    @Value("${mercadopago.config.token}")
    private String token;

    @Bean
    public RestClient restClient() {
        return RestClient.builder().baseUrl("https://api.mercadopago.com").defaultHeaders(e -> {
            e.add("Authorization", "Bearer " + token);
        }).build();
    }
}
