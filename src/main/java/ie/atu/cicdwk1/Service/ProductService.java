package ie.atu.cicdwk1.Service;

import ie.atu.cicdwk1.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
private final List<Product> products= new ArrayList<>();
private long nextId = 1;

public List<Product> getAll() {
    return products;
}

@PostMapping
public Product create(@RequestBody Product product) {
    product.setId(nextId++);
    products.add(product);
    return product;
}
}
