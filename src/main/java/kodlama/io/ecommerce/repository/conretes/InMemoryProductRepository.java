package kodlama.io.ecommerce.repository.conretes;

import kodlama.io.ecommerce.entities.conretes.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AutoConfiguration
public class InMemoryProductRepository implements ProductRepository {
    List<Product> products;

    public InMemoryProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "iPhone 13 Pro Max 256GB", 10, 42.999, "Brand new iPhone 13 Pro Max. Nice and delicate."));
        products.add(new Product(2, "Macbook 16", 10, 56000, "Brand new Macbook 16'. Nice and delicate."));
        products.add(new Product(3, "PlayStation 5", 10, 24.999, "Brand new PlayStation. Nice and delicate."));
        products.add(new Product(4, "XBOX Series X", 10, 17.999, "Brand new XBOX Series X. Nice and delicate."));
        products.add(new Product(5, "Msi Gaming Laptop", 10, 39.999, "Brand new Msi Gaming Laptop. Nice and delicate."));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        return products.get(id-1);
    }

    @Override
    public Product add(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product update(int id, Product product) {
        return products.set(id-1, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id-1);
    }
}
