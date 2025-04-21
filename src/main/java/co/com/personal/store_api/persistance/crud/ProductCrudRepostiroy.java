package co.com.personal.store_api.persistance.crud;

import co.com.personal.store_api.persistance.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepostiroy extends CrudRepository<Product, Integer> {
    public List<Product> findByCategoryIdAndPriceLessThanOrderByNameAsc(int categoryId, double price);
    
    /**
     * Busca todos los productos que tienen al menos la cantidad especificada de unidades disponibles
     * para una talla en particular.
     *
     * @param size       El nombre de la talla para la que se verifica la disponibilidad.
     * @param minimalUnits La cantidad mínima de unidades disponibles requerida para esa talla.
     * @return Una lista de productos que cumplen con los criterios de disponibilidad para la talla especificada.
     */
    public Optional<List<Product>> findByProductSizes_Size_SizeAndProductSizes_AvailableUnitsGreaterThanEqual(String size, Integer minimalUnits);
    
    @Transactional
    @Modifying
    @Query("UPDATE Product p SET p.activo = false WHERE p.id = :id")
    public Integer softDeleteById(Integer id);

}