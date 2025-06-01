package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddress {
    private String id;
    private String country;
    private String department;
    private String city;
    private String longAddress;
    private String shortAddress;
    private String zipCode;
}
