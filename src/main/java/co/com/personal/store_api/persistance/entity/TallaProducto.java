package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "talla_producto")
@Getter
@Setter
public class TallaProducto {
    @EmbeddedId
    private TallaProductoPK id;
    @Column(name = "unidades_disponibles")
    private Integer unidadesDisponibles;
    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id", insertable = false, updatable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_talla", referencedColumnName = "id", insertable = false, updatable = false)
    private Talla talla;
    
    @OneToMany(mappedBy = "productSize")
    private List<PedidoProducto> pedidoProductos;

}