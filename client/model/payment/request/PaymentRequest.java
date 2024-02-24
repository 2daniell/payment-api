package com.apoiacafe.paypamentsapi.client.model.payment.request;

import com.apoiacafe.paypamentsapi.client.model.payment.payer.Payer;

import java.math.BigDecimal;

public record PaymentRequest(
        String description,
        Payer payer,
        String payment_method_id,
        BigDecimal transaction_amount
) {
}
