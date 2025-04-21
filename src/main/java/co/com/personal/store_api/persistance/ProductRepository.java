package co.com.personal.store_api.persistance;

import co.com.personal.store_api.persistance.crud.ProductCrudRepostiroy;
import co.com.personal.store_api.persistance.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ProductCrudRepostiroy productCrudRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getProductsByCategoryWherePriceIsLessThan(double priceToCompare, int categoryId) {
        return productCrudRepository.findByCategoryIdAndPriceLessThanOrderByNameAsc(categoryId, priceToCompare);
    }

    public Optional<List<Product>> getProductsBySizeAndAtLeastAnAmountOfAvailableUnits(String size, Integer availableUnits) {
        return productCrudRepository.findByProductSizes_Size_SizeAndProductSizes_AvailableUnitsGreaterThanEqual(size, availableUnits);
    }

    public Optional<Product> getProduct(Integer id) {
        return productCrudRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productCrudRepository.save(product);
    }

    @Transactional
    public boolean eliminarProductoLogicamente(Integer id) {
        int rowsAffected = productCrudRepository.softDeleteById(id);
        return rowsAffected > 0;
    }
}