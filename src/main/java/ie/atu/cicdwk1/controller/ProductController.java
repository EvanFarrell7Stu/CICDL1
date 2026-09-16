package ie.atu.cicdwk1.controller;

import ie.atu.cicdwk1.model.Product;
import ie.atu.cicdwk1.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }
 }
