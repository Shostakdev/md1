package main.java.order;

import java.util.ArrayList;
import java.util.List;
import main.java.products.Product;

public class Order {
    private List<OrderItem> items;

    public Order(List<OrderItem> items) {
        this.items = new ArrayList<>(items);
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
