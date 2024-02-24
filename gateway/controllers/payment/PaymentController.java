package com.apoiacafe.paypamentsapi.gateway.controllers.payment;

import com.apoiacafe.paypamentsapi.client.model.payment.request.PaymentRequest;
import com.apoiacafe.paypamentsapi.gateway.services.payment.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Object> post(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.payment(paymentRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> get(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findPaymentById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> put(@PathVariable int id, @RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(service.putPayment(id, paymentRequest));
    }
}
