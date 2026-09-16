package ie.atu.cicdwk1.controller;

import ie.atu.cicdwk1.model.Product;
import ie.atu.cicdwk1.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAll{
        return productService.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }
}
