package com.apoiacafe.paypamentsapi.gateway.controllers.client;

import com.apoiacafe.paypamentsapi.client.model.payer.Client;
import com.apoiacafe.paypamentsapi.client.model.payer.request.ClientRequest;
import com.apoiacafe.paypamentsapi.gateway.services.client.ClientService;
import jakarta.validation.constraints.Email;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/query")
    public ResponseEntity<Client> getByEmail(@RequestParam(value = "email") String email) {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findClientByEmail(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findClientById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> put(@PathVariable String id, @RequestBody ClientRequest clientRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.putClient(id, clientRequest));
    }

    @PostMapping
    public ResponseEntity<Object> post(@RequestBody ClientRequest clientRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(clientRequest));
    }
}
