package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariant {
    private Integer id;
    private Product product;
    private Size size;
    private String color;
    private String availableUnits;
    private Double price;
    private Float discount;
}
