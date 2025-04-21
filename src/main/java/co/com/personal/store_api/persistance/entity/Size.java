package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "talla")
@Getter
@Setter
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "talla")
    @Enumerated(EnumType.STRING)
    private Integer size;

    /**
     * @OneToMany(mappedBy = "size") Indica una relación One-to-Many con la entidad ProductSize.
     * Esto permite acceder a la información de la tabla intermedia desde la entidad Talla.
     */
    @OneToMany(mappedBy = "size")
    private List<ProductSize> productSizes;
}