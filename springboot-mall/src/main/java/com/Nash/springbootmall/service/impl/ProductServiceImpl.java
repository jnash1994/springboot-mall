package com.Nash.springbootmall.service.impl;

import com.Nash.springbootmall.dao.ProductDao;
import com.Nash.springbootmall.model.Product;
import com.Nash.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl  implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
