package com.example.service;

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
    public Order getOrderById(int orderId) {        
        return orderRepo.getOrderById(orderId);
    }

    @Override
    public void addOrder(Order order) {
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
