package com.Nash.springbootmall.dao;

import com.Nash.springbootmall.constant.ProductCategory;
import com.Nash.springbootmall.dto.ProductQueryParams;
import com.Nash.springbootmall.dto.ProductRequest;
import com.Nash.springbootmall.model.Product;


import java.util.List;

public interface ProductDao {
    Integer countProduct (ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
   void updateStock(Integer productId,Integer stock);
    void  deleteProductById(Integer productId);

}
