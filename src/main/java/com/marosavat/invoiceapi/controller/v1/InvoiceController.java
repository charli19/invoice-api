package com.marosavat.invoiceapi.controller.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marosavat.invoiceapi.model.response.InvoiceResponse;
import com.marosavat.invoiceapi.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void handleInvoice(@RequestBody InvoiceResponse invoiceResponse) {
        invoiceService.sendInvoice(invoiceResponse.getBody());
    }

}
