package org.example.OrderListRepo;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public void removeOrder(int bestellnummer) {
        orders.removeIf(order -> order.bestellnummer() == bestellnummer);
    }
}