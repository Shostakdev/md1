package main.java.delivery;

public class CourierDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Order delivered by courier.");
    }
}
