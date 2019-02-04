package com.ece.sad;

public abstract class PizzaIngredients implements Pizza{
    protected Pizza pizzaWithIngredients;

    public PizzaIngredients(Pizza pizzaWithIngredients) {
        this.pizzaWithIngredients = pizzaWithIngredients;
    }

    public void bake() {
        pizzaWithIngredients.bake();
    }

}
