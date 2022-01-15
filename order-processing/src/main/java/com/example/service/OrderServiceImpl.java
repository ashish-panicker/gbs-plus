package com.example.service;

import java.io.IOException;
import java.util.List;
import com.example.model.Order;
import com.example.repo.OrderRepo;

public class OrderServiceImpl implements OrderService{

    private OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.getAllOrders();
    }

    @Override
    public Order getOrderById(int orderId) throws ClassNotFoundException, IOException {        
        return orderRepo.getOrderById(orderId);
    }

    @Override
    public void addOrder(Order order) throws IOException {
        orderRepo.addOrder(order);
    }

    @Override
    public void updateOrder(Order order) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteOrder(int orderId) {
        // TODO Auto-generated method stub
        
    }
    
}
