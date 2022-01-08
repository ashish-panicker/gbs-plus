
package com.example.model;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{

    private static final long serialVersionUID = 6529685098267757690L;

    private int orderId;
    private String customer;
    private List<Item> items;
    private double netPrice;

    public Order() {
    }

    public Order(int orderId, String customer, List<Item> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.netPrice = items.stream().mapToDouble(Item::getItemTotalPrice).sum();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer='" + customer + '\'' +
                ", items=" + items +
                ", netPrice=" + netPrice +
                '}';
    }

    
}
