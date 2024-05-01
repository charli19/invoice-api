package com.marosavat.invoiceapi.service.impl;

import com.marosavat.invoiceapi.model.Invoice;
import com.marosavat.invoiceapi.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public void sendInvoice(Invoice invoice) {
        System.out.println(invoice);
    }

}
