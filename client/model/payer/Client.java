package com.apoiacafe.paypamentsapi.client.model.payer;

import com.apoiacafe.paypamentsapi.client.model.payer.request.Identification;
import com.apoiacafe.paypamentsapi.client.model.payer.request.Phone;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

public record Client(
    String id,
    @JsonProperty("date_registred")
    LocalDate dateRegistered,

    @JsonProperty("default_address")
    String defaultAddress,
    @Email
    String email,
    @JsonProperty("first_name")
    String firstName,

    Identification identification,
    @JsonProperty("last_name")
    String lastName,
    Phone phone
){
}
