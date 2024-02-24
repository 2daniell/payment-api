package com.apoiacafe.paypamentsapi.gateway.interfaces.payment;

import com.apoiacafe.paypamentsapi.client.model.payment.Payment;
import com.apoiacafe.paypamentsapi.client.model.payment.request.PaymentRequest;

public interface PaymentFunctions {

    Payment createPayment(PaymentRequest paymentRequest);
    Payment findPaymentById(int id);
    Payment putPayment(int id);
}
