package com.satyabhushan.paymentservice040624.services;

import com.satyabhushan.paymentservice040624.services.paymentgateways.PaymentGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGateway paymentGateway ;

    PaymentService(@Qualifier("stripe") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public String generatePaymentLink(String orderId , Long amount){
        return paymentGateway.createPaymentLink(orderId , amount);
    }

}
