package com.example.repo;

import java.io.IOException;
import java.util.List;
import com.example.model.Order;

public interface OrderRepo {

    public List<Order> getAllOrders();

    public Order getOrderById(int orderId) throws IOException, ClassNotFoundException;

    public void addOrder(Order order) throws IOException;

    public void updateOrder(Order order);

    public void deleteOrder(int orderId);

    
}
