package com.apoiacafe.paypamentsapi.gateway.services.client;

import com.apoiacafe.paypamentsapi.client.model.payer.Client;
import com.apoiacafe.paypamentsapi.client.model.payer.request.ClientRequest;
import com.apoiacafe.paypamentsapi.core.managers.ClientManager;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientManager manager;

    public ClientService(ClientManager manager) {
        this.manager = manager;
    }

    public Client createClient(ClientRequest clientRequest) {
        return manager.createClient(clientRequest);
    }

    public Client putClient(String id, ClientRequest clientRequest) {
        return manager.putClient(id, clientRequest);
    }

    public Client findClientByEmail(@Email @Valid String email) {
        return manager.findClientByEmail(email);
    }

    public Client findClientById(String id) {
        return manager.findClientById(id);
    }
}
