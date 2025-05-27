package co.com.personal.store_api.web.controller;

import co.com.personal.store_api.domain.Product;
import co.com.personal.store_api.domain.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.of(productService.getById(id));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("categoryId") Integer categoryId) {
        return ResponseEntity.of(productService.getByCategory(categoryId));
    }

    @PostMapping("")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deactivate(@PathVariable("id") Integer id) {
        return productService.deactivate(id) ? new ResponseEntity(HttpStatus.OK) : new ResponseEntity(HttpStatus.NOT_FOUND);

    }
}
