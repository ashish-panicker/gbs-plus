package com.example;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import com.example.model.Item;
import com.example.model.Order;
import com.example.repo.OrderRepoDbimpl;
import com.example.repo.OrderRepoFileImpl;
import com.example.service.OrderService;
import com.example.service.OrderServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        System.out.println("Hello World!");

        OrderService orderService = new OrderServiceImpl(new OrderRepoFileImpl());


        List<Item> items = List.of(new Item("I001", "Item 1", 10, 10.24),
                new Item("I002", "Item 2", 20, 20.24), new Item("I003", "Item 3", 30, 30.24));

        double sum = items.stream().mapToDouble(ix -> ix.getItemTotalPrice()).sum();

        System.out.format("Total cost of the order is %4.2f%n", sum);

        Order order = new Order(1, "Customer 1", items);

        // orderService.addOrder(order);


        System.out.println("orders....");

        Optional<Order> optional = Optional.ofNullable(orderService.getOrderById(100));

        optional.ifPresent(System.out::println);

        optional.ifPresentOrElse((o) -> System.out.println(o),
                () -> System.out.println("No orders found"));

        Order ox = optional.orElseThrow();

        if (optional.isPresent()) {
            Order o = optional.get();
            System.out.println(o);
        } else {
            System.out.println("Order not found");
        }
    }
}
