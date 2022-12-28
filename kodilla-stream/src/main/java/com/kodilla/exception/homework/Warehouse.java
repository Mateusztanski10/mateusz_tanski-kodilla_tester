package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Set<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream().filter(order -> order.getNumber().equals(number)).findFirst().orElseThrow(OrderDoesntExistException::new);
    }
}
