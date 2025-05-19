package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="pedido_producto", schema = "tienda")
public class PedidoProducto {
    @EmbeddedId
    private PedidoProductoPK id;
    
    @Column(name="cantidad")
    private Integer cantidad;
    
    @Column(name="precio_unitario")
    private Double precioUnitario;
    
    @Column(name="descuento_aplicado")
    private Integer descuentoAplicado;
    
    @ManyToOne
    @JoinColumn(name = "id_pedido", referencedColumnName = "id", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_talla_producto", referencedColumnName = "id", insertable = false, updatable = false)
    private TallaProducto tallaProducto;
}