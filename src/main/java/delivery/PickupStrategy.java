package main.java.delivery;

public class PickupStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Client picks up the order.");
    }
}
