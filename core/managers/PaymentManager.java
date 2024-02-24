package com.apoiacafe.paypamentsapi.core.managers;

import com.apoiacafe.paypamentsapi.client.model.payment.request.PaymentRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class PaymentManager {

    private final RestClient restClient;

    public PaymentManager(RestClient restClient) {
        this.restClient = restClient;
    }

    public String payment(PaymentRequest paymentRequest) {
        return restClient.post().uri("/v1/payments").header("X-Idempotency-Key", paymentRequest.payer().getId()).body(paymentRequest).retrieve().body(String.class);
    }
}
