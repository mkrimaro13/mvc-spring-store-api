package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "producto",schema = "tienda")
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "enlace_imagen")
    private String enlaceImagen;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "descuento")
    private Integer descuento;
    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id", insertable = false, updatable = false)
    private Categoria categoria;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;
    @Column(name = "activo")
    private Boolean activo;
    @OneToMany(mappedBy = "producto")
    private List<TallaProducto> tallaProductos;
}