package com.marco.paymentservice.service.impl;

import com.marco.paymentservice.model.Payment;
import com.marco.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: recebi o pagamento {}", payment);

    }
}
