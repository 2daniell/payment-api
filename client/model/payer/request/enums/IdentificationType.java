package com.apoiacafe.paypamentsapi.client.model.payer.request.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum IdentificationType {

    CPF("cpf"), CNPJ("cnpj");

    private String name;

    IdentificationType(String name) {
        this.name = name;
    }
}
