package pizza;

import toppings.IntCheese;
import toppings.IntMozzarella;

public class PizzaA extends Pizza implements IntCheese, IntMozzarella {

    public PizzaA(String crust, String sauce) {
        super(crust, sauce);
    }

    @Override
    public void addTopping() {
        addCheese();
        addMozzarella();
    }

    @Override
    public void addCheese() {
        this.toppings.add("Cheese");
    }

    @Override
    public void addMozzarella() {
        this.toppings.add("Mozzarella");
    }
}
