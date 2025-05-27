package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product {
    private Integer id;
    private String name;
    private String description;
    private String image;
    private Double price;
    private Double discount;
    private Category category;
    private List<ProductVariant> sizes;
    private Boolean active;
}