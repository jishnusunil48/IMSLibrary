package com.example.IMSLibrary.requestDto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceDto {
    private Double amount;
    private LocalDate due_date;
}
