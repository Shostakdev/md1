package main.java;

import main.java.client.Client;
import main.java.kitchen.Cook;
import main.java.kitchen.Kitchen;
import main.java.order.Order;
import main.java.products.Dish;
import main.java.products.Drink;

import main.java.waiter.Waiter;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Kitchen kitchen = new Kitchen(cook);

        Waiter waiter = new Waiter(kitchen);

        Client client = new Client("John Doe");

        Dish pasta = new Dish("Pasta", 12.5, "Spaghetti with tomato sauce");
        Drink coke = new Drink("Coke", 2.5, "Soft");

        client.addToCart(pasta, 2);
        client.addToCart(coke, 1);

        client.placeOrder();

        waiter.takeOrder(new Order(client.getCart().getItems()));
    }
}
