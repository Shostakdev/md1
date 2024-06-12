package main.java.kitchen;

import main.java.order.Order;

public class Kitchen {
    private final Cook cook;

    public Kitchen(Cook cook) {
        this.cook = cook;
    }

    public void submitOrder(Order order) {
        cook.prepareOrder(order);
    }
}
