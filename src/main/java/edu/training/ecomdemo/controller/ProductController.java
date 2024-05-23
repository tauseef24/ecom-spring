package edu.training.ecomdemo.controller;

import edu.training.ecomdemo.model.Product;
import edu.training.ecomdemo.service.AdminService;
import edu.training.ecomdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ProductController {
    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;
    @CrossOrigin
    @GetMapping("/productlist")
    public List<Product> getProducts() {
        return userService.productList();
    }
    @CrossOrigin
    @PostMapping("/addproduct")
    public String addProduct(@RequestBody Product product){
        return adminService.addProduct(product);
    }
}
