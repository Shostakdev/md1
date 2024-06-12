package main.java.state;

public class SelfPickupState implements State {
    @Override
    public void handleState() {
        System.out.println("Order is ready for self-pickup.");
    }
}
