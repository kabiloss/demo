/*
package com.example.demo.services;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired private ProductRepository productRepository; // autowired : injection de dependance
    @RequestMapping(value="/products",method = RequestMethod.GET)
    public List<Product> productlist(){
        return productRepository.findAll();
    }
    @RequestMapping(value="/products", method = RequestMethod.POST)
    public Product save (@RequestBody Product p){
        return productRepository.save(p);
    }
}
*/