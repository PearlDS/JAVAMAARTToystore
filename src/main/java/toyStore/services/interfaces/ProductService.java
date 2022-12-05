package toyStore.services.interfaces;

import toyStore.data.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(int id);
    List<Product> getAllProducts();
    List<Product> getAllProductsByBrand(String brand);
}
