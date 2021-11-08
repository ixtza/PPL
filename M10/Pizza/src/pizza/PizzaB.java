package pizza;

import toppings.IntBeef;
import toppings.IntCheese;
import toppings.IntMushroom;

public class PizzaB extends Pizza implements IntBeef, IntMushroom, IntCheese {

    public PizzaB(String crust, String sauce) {
        super(crust, sauce);
    }

    @Override
    public void addTopping() {
        addBeef();
        addMushroom();
        addCheese();
    }

    @Override
    public void addBeef() {
        this.toppings.add("Beef");
    }

    @Override
    public void addCheese() {
        this.toppings.add("Cheese");
    }

    @Override
    public void addMushroom() {
        this.toppings.add("Mushroom");
    }
}
