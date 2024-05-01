package com.marosavat.invoiceapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Invoice {
    private String taxCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate invoiceFulfillmentDate;
    private String invoiceNumber;
    private String currencyCode;
    private Float totalNet;
    private Float totalVat;
    private Float totalGross;
    private Float vatRate;
    private Client client;
    private Company company;
}
