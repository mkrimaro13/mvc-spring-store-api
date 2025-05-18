package co.com.personal.store_api.domain.repository;

import co.com.personal.store_api.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    public List<Product> getAll();

    public Optional<List<Product>> getByCategory(Integer categoryId);

    public Optional<List<Product>> getLowStock(Integer quantity);

    public Optional<Product> getProductById(Integer id);

    public Product create(Product product);

    public Boolean deactivate(Integer id);
}