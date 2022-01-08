package com.example.repo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.example.model.Order;

public class OrderRepoFileImpl implements OrderRepo {

    @Override
    public List<Order> getAllOrders() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderById(int orderId) {
        File dir = new File("orders");
        File file = new File(dir, "order-" + orderId);
        Order order = null;
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) {
            order = (Order) oin.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public void addOrder(Order order) {
        // serialize data to order file
        File dir = new File("orders");
        System.err.println("addOrder()");
        System.out.println("dir: " + dir.getAbsolutePath());
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directory created");
        }
        File file = new File(dir, "order-" + order.getOrderId());
        System.out.println(file.toPath().toString());
        try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outStream.writeObject(order);
            outStream.flush();
            System.out.println("Order saved to file");
        } catch (Exception e) {
            e.printStackTrace();
        }

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
