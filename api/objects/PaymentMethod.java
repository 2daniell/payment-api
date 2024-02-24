package com.apoiacafe.paypamentsapi.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PaymentMethod(
        String id,
        @JsonProperty("issuer_id")
        int issuerId,
        String type
) {
}
