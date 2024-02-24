package com.apoiacafe.paypamentsapi.client.model.payment.request;

import com.apoiacafe.paypamentsapi.client.model.payer.Client;

import java.math.BigDecimal;

public record PaymentRequest(
        String description,
        Client payer,
        String payment_method_id,
        BigDecimal transaction_amount
) {
}
