package edu.training.ecomdemo.service;

import edu.training.ecomdemo.model.Product;
import edu.training.ecomdemo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    ProductRepo repo;

    public List<Product> productList() {
        return repo.findAll();
    }
}
