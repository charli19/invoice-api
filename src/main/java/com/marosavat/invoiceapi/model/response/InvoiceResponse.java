package com.marosavat.invoiceapi.model.response;

import com.marosavat.invoiceapi.model.Invoice;
import lombok.Data;

@Data
public class InvoiceResponse {
    private Invoice body;
}
