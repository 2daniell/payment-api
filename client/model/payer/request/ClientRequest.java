package com.apoiacafe.paypamentsapi.client.model.payer.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

public record ClientRequest(
        @Email @NotBlank
        String email,
        @JsonProperty("first_name")
        String firstName,
        Identification identification,
        @JsonProperty("last_name")
        String lastName,
        Phone phone
) {
}
