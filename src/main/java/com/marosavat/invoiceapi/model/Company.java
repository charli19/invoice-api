package com.marosavat.invoiceapi.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Company implements Serializable {
    private String name;
    private String vatNumber;
    private String street;
    private String house;
    private String city;
    private String postalCode;
    private String countryCode;
    private String uuid;
}
