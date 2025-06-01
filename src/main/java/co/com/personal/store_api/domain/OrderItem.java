package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    private ProductVariant product;
    private Integer quantity;
}
