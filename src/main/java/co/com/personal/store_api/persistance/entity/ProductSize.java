package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "talla_producto")
@Getter
@Setter
public class ProductSize {
    @EmbeddedId
    private ProductSizePK id;

    @Column(name = "unidades_disponibles")
    private Integer availableUnits;

    // Relaciones explícitas.
    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_talla", referencedColumnName = "id", insertable = false, updatable = false)
    private Size size;
    
    @OneToMany(mappedBy = "productSize")
    private List<ProductOrder> productOrders;

}