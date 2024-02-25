package com.apoiacafe.paypamentsapi.gateway.interfaces.payer;

import com.apoiacafe.paypamentsapi.client.model.payer.Client;
import com.apoiacafe.paypamentsapi.client.model.payer.request.ClientRequest;

public interface ClientFunctions {

    Client createClient(ClientRequest clientRequest);
    Client findClientByEmail(String email);
    Client findClientById(String id);
    Client putClient(String id, ClientRequest clientRequest);

}
