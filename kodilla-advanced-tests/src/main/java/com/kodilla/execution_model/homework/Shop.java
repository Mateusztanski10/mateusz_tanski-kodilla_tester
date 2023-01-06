package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> returnListWithOrdersFromLastTwoYears(int date) {
        return orders
                .stream()
                .filter(n -> n.getDate() > date)
                .collect(Collectors.toList());
    }

    public List<Order> getOrderBetweenMinValueAndMaxValue(int min, int max) {
        return orders
                .stream()
                .filter(n -> n.getValueOfOrder() > min && < max)
                .collect(Collectors.toList());
    }

    public int returnSizeOfOrders() {
        return this.orders.size();
    }

    public double returnAllOrdersValue() {
        for (Order order : orders) {
            double sum = order.getValueOfOrder();
            return sum;
        }
    }
}
