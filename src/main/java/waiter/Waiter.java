package main.java.waiter;

import main.java.kitchen.Kitchen;
import main.java.order.Order;

public class Waiter {
    private static Kitchen kitchen;

    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public static void takeOrder(Order order) {
        if (kitchen != null) {
            kitchen.submitOrder(order);
        } else {
            System.out.println("Kitchen is not initialized!");
        }
    }
}
