package com.apoiacafe.paypamentsapi.client.model.payment.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PaymentMethod(
        String id,
        @JsonProperty("issuer_id")
        int issuerId,
        String type
) {
}
