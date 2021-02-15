package controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mvc.entities.Product;
import mvc.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    privste final ProductService productService;
    @GetMapping
    public List<Product> getProductList(){
        return productService.findAll();

    }
    @GetMapping(value = "/{id}", produces = "application/json")
    public Product getProductById(@PathVariable Long id){
        return productService.findById(id).orElseThrow(() -> new RuntimeException("Unable to find product with id: " +id));
    }


}

