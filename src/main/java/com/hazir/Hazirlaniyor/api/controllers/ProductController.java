package com.hazir.Hazirlaniyor.api.controllers;

import com.hazir.Hazirlaniyor.business.concretes.ProductManager;
import com.hazir.Hazirlaniyor.entity.concretes.Product;
import com.hazir.Hazirlaniyor.entity.concretes.ProductCategory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductController {
    private final ProductManager productManager;
    @GetMapping
    List<Product> getAllProducts(){
        return this.productManager.getAllProducts();
    }
    @PostMapping
    public void Save(@RequestBody Product product){
        this.productManager.AddProduct(product);
    }

	@GetMapping(path = "{productCategory}")
	List<Product> findProductsByCategory(@RequestBody ProductCategory productCategory) {
		return this.productManager.findProductsByCategory (productCategory);
	}
    @DeleteMapping(path = "{productId}")
    void DeleteProduct(@PathVariable("productId")Long Id){
        this.productManager.DeleteProduct(Id);
    }
}
