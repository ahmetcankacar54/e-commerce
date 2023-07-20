package kodlama.io.ecommerce.business.conretes;

import kodlama.io.ecommerce.business.abstracts.ProductService;
import kodlama.io.ecommerce.entities.conretes.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import java.util.List;


public class ProductManager implements ProductService {
    private final ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public Product add(Product product) {
        validateProduct(product);
        return repository.add(product);
    }

    @Override
    public Product update(int id, Product product) {
        validateProduct(product);
        return repository.update(id, product);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    private void validateProduct(Product product){
        checkIfUnitPriceValid(product);
        checkIfQuantityValid(product);
        checkIfDescriptionValid(product);
    }

    private void checkIfUnitPriceValid(Product product){
        if(product.getUnitPrice() <= 0) throw new IllegalArgumentException("Price cannot be less then or equal 0");
    }
    private void checkIfQuantityValid(Product product){
        if (product.getQuantity() < 0) throw new IllegalArgumentException("Quantity cannot be less then 0");
    }
    private void checkIfDescriptionValid(Product product){
        int k;
        String i = product.getDescription();
        k = i.length();
        if(k>10 & k<50) throw new IllegalArgumentException("Description cannot be less than 10 and greater then 50 characters");
    }
}
