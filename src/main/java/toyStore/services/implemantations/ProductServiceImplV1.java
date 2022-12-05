package toyStore.services.implemantations;

import toyStore.data.Product;
import toyStore.repositories.ProductRepository;
import toyStore.services.interfaces.ProductService;

import java.util.List;

public class ProductServiceImplV1 implements ProductService {


    private ProductRepository productRepository;

    public ProductServiceImplV1(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }
}
