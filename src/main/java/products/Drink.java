package main.java.products;

public class Drink extends Product {
    private String type;

    public Drink(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String getDescription() {
        return type + " drink";
    }
}
