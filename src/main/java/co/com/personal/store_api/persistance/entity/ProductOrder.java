package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProductOrder {
    @EmbeddedId
    private ProductOrderPK id;
    
    @Column(name="cantidad")
    private Integer quantity;
    
    @Column(name="precio_unitario")
    private Double unitPrice;
    
    @Column(name="descuento_aplicado")
    private Integer discount;
    
    @ManyToOne
    @JoinColumn(name = "id_pedido", referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_talla_producto", referencedColumnName = "id", insertable = false, updatable = false)
    private ProductSize productSize;
}