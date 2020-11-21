/*
package com.example.demo.services;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryRestService {
    @Autowired private CategoryRepository categoryRepository; // autowired : injection de dependance
    @RequestMapping(value="/categories",method = RequestMethod.GET)
    public List<Category> categoryList(){
        return categoryRepository.findAll();
    }
    @RequestMapping(value="/categories", method = RequestMethod.POST)
    public Category save (@RequestBody Category c){
        return categoryRepository.save(c);
    }
}
*/