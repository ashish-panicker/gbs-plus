package com.example.service;

import java.io.IOException;
import java.util.List;
import com.example.model.Order;

public interface OrderService {

    public List<Order> getAllOrders();

    public Order getOrderById(int orderId) throws ClassNotFoundException, IOException;

    public void addOrder(Order order) throws IOException;

    public void updateOrder(Order order);

    public void deleteOrder(int orderId);

    
}
