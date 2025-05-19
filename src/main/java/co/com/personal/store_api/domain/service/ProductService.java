package co.com.personal.store_api.domain.service;

import co.com.personal.store_api.domain.Product;
import co.com.personal.store_api.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Optional<Product> getById(Integer id) {
        return repository.getProductById(id);
    }

    public Optional<List<Product>> getByCategory(Integer categoryId) {
        return repository.getByCategory(categoryId);
    }

    public Product create(Product product) {
        return repository.create(product);
    }

    public Boolean deactivate(Integer id) {
        return repository.deactivate(id);

    }


}
