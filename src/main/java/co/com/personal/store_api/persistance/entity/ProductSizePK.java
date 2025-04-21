package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class ProductSizePK implements Serializable {
    @Column(name = "id_producto")
    private Integer productId;

    @Column(name = "id_talla")
    private Integer sizeId;
}