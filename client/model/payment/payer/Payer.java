package com.apoiacafe.paypamentsapi.client.model.payment.payer;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payer {

    private String id;
    private String entity_type;
    private String type;
    private String email;

}
