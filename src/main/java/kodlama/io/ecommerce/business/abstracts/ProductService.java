package kodlama.io.ecommerce.business.abstracts;

import kodlama.io.ecommerce.entities.conretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    List<Product> getAll();


    public Product getById(int id);


    public Product add(Product product);


    public Product update(int id, Product product);


    public void delete(int id);
}
