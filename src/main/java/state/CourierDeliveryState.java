package main.java.state;

public class CourierDeliveryState implements State {
    @Override
    public void handleState() {
        System.out.println("Order is out for courier delivery.");
    }
}
