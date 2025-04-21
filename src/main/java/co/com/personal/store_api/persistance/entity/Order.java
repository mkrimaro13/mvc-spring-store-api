package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedido")
@Getter
@Setter
public class Order {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id", insertable = false, updatable = false)
    private Customer customer;
    @Column(name = "fecha")
    private LocalDateTime date;
    @Column(name = "total")
    private Double total;
    @Column(name = "estado")
    private String state;
    @Column(name = "fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name = "fecha_pago")
    private LocalDateTime paymentDate;
    @Column(name = "fecha_envio")
    private LocalDateTime shipmentDate;
    @Column(name = "fecha_entrega")
    private LocalDateTime deliveryDate;
    @Column(name = "fecha_cierre    ")
    private LocalDateTime completionDate;
    @OneToMany(mappedBy = "order")
    private List<ProductOrder> productOrders;

}