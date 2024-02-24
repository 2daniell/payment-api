package com.apoiacafe.paypamentsapi.client.model.payer.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Phone(
        @JsonProperty("area_code")
        String areaCode,
        String number
) {
}
