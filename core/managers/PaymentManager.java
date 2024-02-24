package com.apoiacafe.paypamentsapi.core.managers;

import com.apoiacafe.paypamentsapi.client.model.payment.Payment;
import com.apoiacafe.paypamentsapi.client.model.payment.request.PaymentRequest;
import com.apoiacafe.paypamentsapi.gateway.interfaces.payment.PaymentFunctions;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class PaymentManager implements PaymentFunctions {

    private final RestClient restClient;

    public PaymentManager(RestClient restClient) {
        this.restClient = restClient;
    }

    public Payment createPayment(PaymentRequest paymentRequest) {
        return restClient.post().uri("/v1/payments").header("X-Idempotency-Key", paymentRequest.payer().id()).body(paymentRequest).retrieve().body(Payment.class);
    }

    public Payment findPaymentById(int id) {
        return restClient.get().uri("v1/payments/{id}", id).retrieve().body(Payment.class);
    }

    @Override
    public Payment putPayment(int id, PaymentRequest paymentRequest) {
        return restClient.put().uri("v1/payments/{id}", id).body(paymentRequest).retrieve().body(Payment.class);
    }
}
