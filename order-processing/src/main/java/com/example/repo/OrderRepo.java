package com.example.repo;

import java.util.List;
import com.example.model.Order;

public interface OrderRepo {

    public List<Order> getAllOrders();

    public Order getOrderById(int orderId);

    public void addOrder(Order order);

    public void updateOrder(Order order);

    public void deleteOrder(int orderId);

    
}
