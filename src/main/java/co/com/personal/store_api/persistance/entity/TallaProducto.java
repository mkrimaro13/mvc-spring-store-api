package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// import java.util.List;

@Entity
@Table(name = "talla_producto")
@Getter
@Setter
public class TallaProducto {

    @Column(name="id")
    private Integer id;


    @EmbeddedId
    private TallaProductoPK embeddedId;

    @Column(name = "unidades_disponibles")
    private Integer unidadesDisponibles;

    @ManyToOne
    @MapsId("idProducto")
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne
    @MapsId("idTalla")
    @JoinColumn(name = "id_talla")
    private Talla talla;

    // @OneToMany(mappedBy = "productSize")
    // private List<PedidoProducto> pedidoProductos;

}