package com.example.IMSLibrary.responseDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponseDto {
    private Long invoiceId;
    private Double paidAmount;
    private String status;
    private String message;
}
