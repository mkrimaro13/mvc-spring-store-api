package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "cliente_direccion")
@Getter
@Setter
public class Direccion {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id", insertable = false, updatable = false)
    private Cliente cliente;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "pais")
    private String pais;
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;
}