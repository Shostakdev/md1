package main.java.products;

public class Dish extends Product {
    private String description;

    public Dish(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
