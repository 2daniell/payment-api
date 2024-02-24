package com.apoiacafe.paypamentsapi.core.managers;

import com.apoiacafe.paypamentsapi.client.model.payer.Client;
import com.apoiacafe.paypamentsapi.client.model.payer.request.ClientRequest;
import com.apoiacafe.paypamentsapi.gateway.interfaces.payer.ClientFunctions;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class ClientManager implements ClientFunctions {

    private final RestClient restClient;

    public ClientManager(RestClient restClient) {
        this.restClient = restClient;
    }


    @Override
    public String createClient(ClientRequest clientRequest) {
        return restClient.post().uri("/v1/customers").body(clientRequest).retrieve().body(String.class);
    }

    @Override
    public Client findClientByEmail(String email) {
        return restClient.get().uri(uriBuilder -> uriBuilder.path("/v1/customers/search")
                .queryParam("email", email).build()).retrieve().body(Client.class);
    }

    @Override
    public Client findClientById(String id) {
        return restClient.get().uri("/v1/customers/{id}", id).retrieve().body(Client.class);
    }

    @Override
    public Client putClient(String id, ClientRequest clientRequest) {
        return restClient.post().uri("/v1/customers", id).body(clientRequest).retrieve().body(Client.class);
    }
}
