package com.example.demo.Controller;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.Servies.ProductServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/product")
public class ProductController {
    private   ProductServies productServies;
   public ProductController(ProductServies productServies) {
       this.productServies = productServies;
   }



    @GetMapping(path = "/get-all")
    public List<ProductEntity> getAllProduct (){
        return productServies.getAllProduct( );
    }

    @PostMapping(path = "/addProduct")

    public ProductEntity addProduct (@RequestBody ProductEntity product){
        System.out.println(product);
        return this.productServies.addProduct(product);
    }


}
