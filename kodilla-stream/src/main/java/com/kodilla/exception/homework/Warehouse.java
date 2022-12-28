package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Set<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }

    public Set<Order> getOrder(String number) {
        getOrder(number)
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .forEach(System.out::println);
        return getOrder(number);
        }

    public String isOrderInUse(String number) throws OrderDoesntExistException {
        if(getOrder(number).equals(number))
            return getOrder(number).toString();
        throw new OrderDoesntExistException();
    }
}
