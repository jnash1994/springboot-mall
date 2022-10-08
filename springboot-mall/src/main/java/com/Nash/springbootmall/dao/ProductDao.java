package com.Nash.springbootmall.dao;

import com.Nash.springbootmall.constant.ProductCategory;
import com.Nash.springbootmall.dto.ProductRequest;
import com.Nash.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductCategory category,String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
   void  deleteProductById(Integer productId);
}
