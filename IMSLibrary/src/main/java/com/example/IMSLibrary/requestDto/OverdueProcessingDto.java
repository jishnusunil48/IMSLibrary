package com.example.IMSLibrary.requestDto;

import lombok.Data;

@Data
public class OverdueProcessingDto {
    private Double lateFee;     // The late fee to be applied to overdue invoices
    private Integer overdueDays; // The number of days the invoice is overdue
}