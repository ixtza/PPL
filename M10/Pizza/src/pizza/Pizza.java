package pizza;

import toppings.Toppings;

import java.util.ArrayList;

/**
 * pizza.Pizza
 */
public class Pizza extends Toppings implements EatPizza {
    protected String crust;
    protected String sauce;

    public Pizza(String crust, String sauce) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = new ArrayList<String>();
    }

    @Override
    public void eatPizza() {
        String eatingText = "Pizza dengan crust " + this.crust + ", sauce " + this.sauce + ", serta toppings:\n";
        int index = 1;
        for (String topping :
                this.toppings) {
            eatingText += (index++) + ". " + topping + "\n";
        }
        System.out.println(eatingText);
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void addTopping() {

    }
}