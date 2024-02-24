package com.apoiacafe.paypamentsapi.client.model.payment;

import com.apoiacafe.paypamentsapi.api.objects.PaymentMethod;
import com.apoiacafe.paypamentsapi.client.model.payer.Client;
import com.apoiacafe.paypamentsapi.client.response.PointOfInteraction;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public record Payment(

    int id,
    @JsonProperty("date_created")
    String dateCreated,
    @JsonProperty("payment_type_id")
    String parentTypeId,
    String status,
    @JsonProperty("transaction_amount")
    BigDecimal transactionAmount,
    Client payer,
    @JsonProperty("payment_method")
    PaymentMethod paymentMethod,
    @JsonProperty("point_of_interaction")
    PointOfInteraction pointOfInteraction
) {

}
