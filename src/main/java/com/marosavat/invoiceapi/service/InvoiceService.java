package com.marosavat.invoiceapi.service;

import com.marosavat.invoiceapi.model.Invoice;

public interface InvoiceService {
    void sendInvoice(Invoice invoice);
}
