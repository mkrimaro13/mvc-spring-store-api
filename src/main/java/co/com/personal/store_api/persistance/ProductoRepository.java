package co.com.personal.store_api.persistance;

import co.com.personal.store_api.domain.Product;
import co.com.personal.store_api.domain.repository.ProductRepository;
import co.com.personal.store_api.persistance.crud.RepositorioCrudProducto;
import co.com.personal.store_api.persistance.entity.Producto;
import co.com.personal.store_api.persistance.mapper.ProductMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private RepositorioCrudProducto productCrudRepository;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Optional<Product> getProductById(Integer id) {
        return productCrudRepository.findById(id).map(productMapper::toProduct);
    }

    @Override
    public List<Product> getAll() {
        return productMapper.toProducts((List<Producto>) productCrudRepository.findAll());
    }

    @Override
    public Optional<List<Product>> getByCategory(Integer categoryId) {
        return productCrudRepository.findByCategoria_id(categoryId).map(productMapper::toProducts);
    }

    @Override
    public Optional<List<Product>> getLowStock(Integer quantity) {
        return productCrudRepository.findByTallaProductos_UnidadesDisponiblesLessThanEqual(quantity).map(productMapper::toProducts);
    }

    @Override
    public Product create(Product product) {
        // Se toma el parámentro de entrada, se convierte a un Producto, se almacena en envía a almacenar
        // Luego se toma respuesta y se vuelve a convertir en Product.
        return productMapper.toProduct(productCrudRepository.save(productMapper.toProducto(product)));
    }

    @Transactional
    @Override
    public Boolean deactivate(Integer id) {
        int rowsAffected = productCrudRepository.softDeleteById(id);
        return rowsAffected > 0;
    }
}