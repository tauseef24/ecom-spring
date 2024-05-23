package edu.training.ecomdemo.service;

import edu.training.ecomdemo.model.Product;
import edu.training.ecomdemo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AdminService {
    @Autowired
    ProductRepo repo;

    public String addProduct(@RequestBody Product product) {
        repo.save(product);
        return "Product added Successfully";
    }
}
