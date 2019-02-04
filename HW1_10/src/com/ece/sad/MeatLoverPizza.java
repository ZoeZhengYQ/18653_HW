package com.ece.sad;

public class MeatLoverPizza extends PizzaIngredients {
    public MeatLoverPizza(Pizza pizzaWithIngredients) {
        super(pizzaWithIngredients);
    }

    @Override
    public void bake() {
        pizzaWithIngredients.bake();
        addMeat(pizzaWithIngredients);
    }

    private void addMeat(Pizza pizzaWithIngredients) {
        System.out.println("Adding meat toppings...");
    }
}
