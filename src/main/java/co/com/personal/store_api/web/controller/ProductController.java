package co.com.personal.store_api.web.controller;

import co.com.personal.store_api.domain.Product;
import co.com.personal.store_api.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable("id") Integer id) {
        return productService.getById(id);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getByCategory(@PathVariable("categoryId") Integer categoryId) {
        return productService.getByCategory(categoryId);
    }

    @PostMapping("")
    public Product create(Product product) {
        return productService.create(product);
    }

    @DeleteMapping("")
    public Boolean deactivate(Integer id) {
        return productService.deactivate(id);

    }
}
