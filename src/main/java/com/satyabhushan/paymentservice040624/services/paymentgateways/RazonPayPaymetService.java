package com.satyabhushan.paymentservice040624.services.paymentgateways;

import org.springframework.stereotype.Service;

@Service("razorpay")
public class RazonPayPaymetService implements  PaymentGateway{

    public String createPaymentLink(String orderId , Long amount){
        return null;
    }
}
