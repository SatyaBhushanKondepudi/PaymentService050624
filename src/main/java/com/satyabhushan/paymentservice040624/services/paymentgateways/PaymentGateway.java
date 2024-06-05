package com.satyabhushan.paymentservice040624.services.paymentgateways;

import org.springframework.stereotype.Service;

@Service
public interface PaymentGateway {

    public String createPaymentLink(String orderId , Long amount);
}
