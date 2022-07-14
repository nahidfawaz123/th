 package com.example.demo.Servies;

 import com.example.demo.Entity.ProductEntity;
 import com.example.demo.Repository.ProductRepository;
 import org.springframework.stereotype.Service;

 import java.util.List;


 @Service
public class ProductServies {

private ProductRepository productRepository;

     public ProductServies(ProductRepository productRepository) {
         this.productRepository = productRepository;
     }


     public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }

    public ProductEntity addProduct(ProductEntity product) {

        System.out.println(product);

        return productRepository.save(product);

    }
}
