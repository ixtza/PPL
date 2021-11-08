package main;
import pizza.*;

public class Main {
    public static void main(String[] args) {
        Pizza[] pizzas = {
                new PizzaA("wheat", "tomato"),
                new PizzaB("wheat", "chilli")
        };

        consumePizza(pizzas);
    }

    static void consumePizza(Pizza[] pizzas) {
        int index = 1;
        for (Pizza pizza :
                pizzas) {
            System.out.println("Pizza-" + (index++) + ":");
            pizza.addTopping();
            pizza.eatPizza();
        }
    }
}
