package com.example.IMSLibrary.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class InvoiceResponseDto {
    private Long id;
    private Double amount;
    private LocalDate dueDate;
    private String status;
}

