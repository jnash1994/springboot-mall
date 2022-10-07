package com.Nash.springbootmall.dao;

import com.Nash.springbootmall.dto.ProductRequest;
import com.Nash.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
