package com.example.service;

import java.util.List;
import com.example.model.Order;

public interface OrderService {

    public List<Order> getAllOrders();

    public Order getOrderById(int orderId);

    public void addOrder(Order order);

    public void updateOrder(Order order);

    public void deleteOrder(int orderId);

    
}
