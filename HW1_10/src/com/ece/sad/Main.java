package com.ece.sad;

public class Main {

    public static void main(String[] args) {
	    Pizza cheesePizza = new CheesePizza();

	    Pizza vegPizza = new VegPizza(new CheesePizza());

	    Pizza meatPizza = new MeatLoverPizza(new CheesePizza());


	    System.out.println("Cheese pizza: ");
	    cheesePizza.bake();

	    System.out.println("\nVegetable pizza: ");
        vegPizza.bake();

        System.out.println("\nMeat lover pizza: ");
        meatPizza.bake();
    }
}
