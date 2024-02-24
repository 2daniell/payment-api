package com.apoiacafe.paypamentsapi.gateway.services;

import com.apoiacafe.paypamentsapi.client.model.payment.request.PaymentRequest;
import com.apoiacafe.paypamentsapi.core.managers.PaymentManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentManager manager;

    public PaymentService(PaymentManager manager) {
        this.manager = manager;
    }

    @Transactional
    public String payment(PaymentRequest paymentRequest){
        return manager.payment(paymentRequest);
    }
}
