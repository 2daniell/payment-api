package com.apoiacafe.paypamentsapi.gateway.interfaces.payer;

import com.apoiacafe.paypamentsapi.client.model.payer.Client;

public interface ClientFunctions {

    Client createClient();
    Client findClientByEmail(String email);
    Client findClientById(int id);
    Client putClient(int id);

}
