package com.satyabhushan.paymentservice040624.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDto {
    private String orderId;
    private Long amount;
}
