package com.yts8.sixuniverse.payment.service;

import com.yts8.sixuniverse.payment.dto.PaymentDto;
import com.yts8.sixuniverse.payment.repository.PaymentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

  private final PaymentMapper paymentMapper;

  @Override
  public void paymentInsert(PaymentDto paymentDto) {
    paymentMapper.paymentInsert(paymentDto);
  }
}