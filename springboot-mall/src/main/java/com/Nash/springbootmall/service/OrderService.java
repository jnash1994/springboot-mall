package com.Nash.springbootmall.service;

import com.Nash.springbootmall.dto.CreateOrderRequest;
import com.Nash.springbootmall.dto.OrderQueryParams;
import com.Nash.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder (OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
