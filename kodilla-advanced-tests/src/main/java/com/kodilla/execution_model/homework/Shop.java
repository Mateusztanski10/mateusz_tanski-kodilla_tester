package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public int getListWithOrdersFromLastTwoYears(double date) {
        List<Order> listWithOrdersFromLastTwoYears = new ArrayList<>();
        for(Order order : orders) {
            if (order.getDate() > date) {
                listWithOrdersFromLastTwoYears.add(order);
            }
        }
        return listWithOrdersFromLastTwoYears.size();
    }

    public int getOrderBetweenMinValueAndMaxValue(double minValueOfOrder, double maxValueOfOrder) {
        List<Order> orderBetweenMinValueAndMaxValue = new ArrayList<>();
        for (Order order : orders) {
            if(order.getValueOfOrder() > minValueOfOrder && order.getValueOfOrder() < maxValueOfOrder) {
                orderBetweenMinValueAndMaxValue.add(order);
            }
        }
        return orderBetweenMinValueAndMaxValue.size();
    }

    public int getSizeOfOrders () {
         return orders.size();
    }

    public static double getAllOrdersValue () {
        double sum = 0.0;
        for (Order order : orders) {
            sum += order.getValueOfOrder();
        }
        return sum;
    }
}