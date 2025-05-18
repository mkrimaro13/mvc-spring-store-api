package co.com.personal.store_api.web.controller;

import co.com.personal.store_api.domain.Product;
import co.com.personal.store_api.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    public ProductService productService;

    public List<Product> getAll() {
        return productService.getAll();
    }

    public Optional<Product> getById(Integer id) {
        return productService.getById(id);
    }

    public Optional<List<Product>> getByCategory(Integer categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Product create(Product product) {
        return productService.create(product);
    }

    public Boolean deactivate(Integer id) {
        return productService.deactivate(id);

    }
}
