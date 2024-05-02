package com.marosavat.invoiceapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class Client implements Serializable {
    private String name;
    private String vatNumber;
    private String street;
    private String house;
    private String city;
    private String postalCode;
    private String countryCode;
    private String uuid;
}
