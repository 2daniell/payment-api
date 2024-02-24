package com.apoiacafe.paypamentsapi.client.model.payer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private String id;
    @JsonProperty("entity_type")
    private String entityType;
    private String type;
    private String email;

}
