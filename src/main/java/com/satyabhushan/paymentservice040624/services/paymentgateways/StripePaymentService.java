package com.satyabhushan.paymentservice040624.services.paymentgateways;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentGateway {
    public String createPaymentLink(String orderId , Long amount){
        return null;
    }
}
