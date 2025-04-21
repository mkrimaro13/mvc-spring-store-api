package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class ProductOrderPK implements Serializable{
    @Column(name = "id_pedido")
    private Integer orderId;

    @Column(name = "id_talla_producto")
    private Integer sizeProductId;
}