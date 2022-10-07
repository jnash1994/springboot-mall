package com.Nash.springbootmall.service;

import com.Nash.springbootmall.dto.ProductRequest;
import com.Nash.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
    void  deleteProductById(Integer productId);
}
