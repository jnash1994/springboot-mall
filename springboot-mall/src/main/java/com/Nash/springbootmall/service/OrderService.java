package com.Nash.springbootmall.service;

import com.Nash.springbootmall.dto.CreateOrderRequest;
import com.Nash.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
