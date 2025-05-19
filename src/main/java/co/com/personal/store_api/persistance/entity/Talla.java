package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// import java.util.List;

@Entity
@Table(name = "talla")
@Getter
@Setter
public class Talla{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "talla")
    // @Enumerated(EnumType.STRING)
    private String talla;
    // @OneToMany(mappedBy = "unidades_disponibles")
    // private List<TallaProducto> tallaProductos;
}