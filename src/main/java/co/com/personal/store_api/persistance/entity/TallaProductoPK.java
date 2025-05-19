package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class TallaProductoPK implements Serializable {
    @Column(name = "id_producto",insertable = false, updatable = false)
    private Integer idProducto;

    @Column(name = "id_talla",insertable = false, updatable = false)
    private Integer idTalla;
}