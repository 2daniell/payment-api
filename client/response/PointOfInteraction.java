package com.apoiacafe.paypamentsapi.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PointOfInteraction(
        @JsonProperty("transaction_data")
        TransactionData transactionData
) {
}
