package main.java.observer;

public class OrderObserver implements Observer {
    private String clientName;

    public OrderObserver(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(String message) {
        System.out.println(clientName + ": " + message);
    }
}
