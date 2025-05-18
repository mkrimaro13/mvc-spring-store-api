package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Integer id;
    private String description;
    private String image;
    private Double price;
    private Category category;
//    private List<Size> sizes;
    private Boolean active;
}