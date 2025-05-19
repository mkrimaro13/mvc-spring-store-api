package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedido", schema = "tienda")
@Getter
@Setter
public class Pedido {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id", insertable = false, updatable = false)
    private Cliente cliente;
    @Column(name = "fecha")
    private LocalDateTime fecha;
    @Column(name = "total")
    private Double total;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;
    @Column(name = "fecha_envio")
    private LocalDateTime fechaEnvio;
    @Column(name = "fecha_entrega")
    private LocalDateTime fechaEntrega;
    @Column(name = "fecha_cierre")
    private LocalDateTime fechaCierre;
    @OneToMany(mappedBy = "pedido")
    private List<PedidoProducto> pedidoProducto;

}