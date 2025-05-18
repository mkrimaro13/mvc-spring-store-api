package co.com.personal.store_api.persistance.crud;

import co.com.personal.store_api.persistance.entity.Producto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RepositorioCrudProducto extends CrudRepository<Producto, Integer> {
    public List<Producto> findByCategoryIdAndPriceLessThanOrderByNameAsc(int idCategoria, double precio);

    /**
     * Busca todos los productos que tienen al menos la cantidad especificada de unidades disponibles
     * para una talla en particular.
     *
     * @param talla       El nombre de la talla para la que se verifica la disponibilidad.
     * @param unidadesMinimas La cantidad mínima de unidades disponibles requerida para esa talla.
     * @return Una lista de productos que cumplen con los criterios de disponibilidad para la talla especificada.
     */
    public Optional<List<Producto>> findByTallaProductos_Talla_TallaAndTallaProductos_UnidadesDisponiblesGreaterThanEqual(String talla, Integer unidadesMinimas);
    public Optional<List<Producto>> findByCategoria_id(Integer id);
    public Optional<List<Producto>> findByTallaProductos_UnidadesDisponiblesLessThanEqual(Integer quantity);

    @Transactional
    @Modifying
    @Query("UPDATE Product p SET p.activo = false WHERE p.id = :id")
    public Integer softDeleteById(Integer id);

}