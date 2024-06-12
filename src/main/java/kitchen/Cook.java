package main.java.kitchen;

import main.java.order.Order;
import main.java.order.OrderItem;
import main.java.products.Dish;

public class Cook {
    public void prepareOrder(Order order) {
        for (OrderItem item : order.getItems()) {
            if (item.getProduct() instanceof Dish) {
                Dish dish = (Dish) item.getProduct();
                System.out.println("Preparing " + dish.getName() + "...");
            }
        }
        System.out.println("Order prepared.");
    }
}
