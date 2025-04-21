package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "cliente_direccion")
@Getter
@Setter
public class Address {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id", insertable = false, updatable = false)
    private Customer customer;
    @Column(name = "direccion")
    private String address;
    @Column(name = "pais")
    private String country;
    @Column(name = "departamento")
    private String department;
    @Column(name = "ciudad")
    private String city;
    @Column(name = "codigo_postal")
    private String zipCode;
    @Column(name = "tipo")
    private String type;
    @Column(name = "fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime updateDate;
}