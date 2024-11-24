package com.example.IMSLibrary.responseDto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class OverdueProcessingResponseDto {
    private Integer processedInvoicesCount;
    private List<Long> newInvoiceIds;
    private String message;
}