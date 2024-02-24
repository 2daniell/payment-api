package com.apoiacafe.paypamentsapi.client.model.payer.request;

import com.apoiacafe.paypamentsapi.client.model.payer.request.enums.IdentificationType;

public record Identification(

        String type,
        String number
) {
}
