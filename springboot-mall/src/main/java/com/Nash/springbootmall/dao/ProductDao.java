package com.Nash.springbootmall.dao;

import com.Nash.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
