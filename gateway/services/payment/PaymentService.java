package com.apoiacafe.paypamentsapi.gateway.services.payment;

import com.apoiacafe.paypamentsapi.client.model.payment.Payment;
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
    public Payment payment(PaymentRequest paymentRequest){
        return manager.createPayment(paymentRequest);
    }

    @Transactional
    public Payment findPaymentById(int id) {
        return manager.findPaymentById(id);
    }
}
