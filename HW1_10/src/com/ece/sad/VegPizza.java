package com.ece.sad;

public class VegPizza extends PizzaIngredients {

    public VegPizza(Pizza pizzaWithIngredients) {
        super(pizzaWithIngredients);
    }

    @Override
    public void bake() {
        pizzaWithIngredients.bake();
        addVeg(pizzaWithIngredients);
    }

    private void addVeg(Pizza pizzaWithIngredients) {
        System.out.println("Adding vegetables...");
    }
}
