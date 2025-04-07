package com.example.booking_service.feign;

import com.example.booking_service.entity.StripeResponse;
import com.example.booking_service.entity.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "PAYMENTGATEWAY")
public interface PaymentServiceFeign {

    @PostMapping("/pay/checkout")
    StripeResponse makePayment(@RequestBody PaymentRequest request,
                               @RequestHeader("Authorization") String token);
}