package com.satyabhushan.paymentservice040624.services.paymentgateways;

import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public interface PaymentGateway {

    public String createPaymentLink(String orderId , Long amount) throws StripeException;
}
