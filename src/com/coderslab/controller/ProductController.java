package com.coderslab.controller;

import com.coderslab.dao.ProductDao;
import com.coderslab.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductController {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

    public Product getProduct(int id) {
        return productDao.getProduct(id);
    }

    public boolean saveProduct(Product product) {
        return productDao.saveProduct(product);
    }

    public boolean updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    public boolean deleteProduct(Product product) {
        return productDao.deleteProduct(product);
    }

}
