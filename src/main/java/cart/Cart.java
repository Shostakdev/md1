package main.java.cart;

import java.util.ArrayList;
import java.util.List;
import main.java.order.OrderItem;
import main.java.products.Product;

public class Cart {
    private List<OrderItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addOrderItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public void clear() {
        items.clear();
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
