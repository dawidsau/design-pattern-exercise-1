package main;

import pizza.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza capriciosa = factory.createPizza(PizzaType.CAPRICIOSA, 24.00, Arrays.asList("Cheese", "Ham", "Champignons"));
        System.out.println(capriciosa);

    }

}
