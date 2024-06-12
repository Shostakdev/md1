package main.java.client;

import main.java.cart.Cart;
import main.java.order.Order;
import main.java.products.Dish;
import main.java.products.Drink;
import main.java.waiter.Waiter;

public class Client {
    private String name;
    private Cart cart;

    public Client(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    public void addToCart(Dish dish, int quantity) {
        cart.addOrderItem(dish, quantity);
    }

    public void addToCart(Drink drink, int quantity) {
        cart.addOrderItem(drink, quantity);
    }

    public void placeOrder() {
        Order order = new Order(cart.getItems());
        Waiter.takeOrder(order);
        cart.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }
}
