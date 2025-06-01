package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String gender;
    private String email;
    private String phoneNumber;
    private CustomerAddress customerAddress;
    private String active;
}
