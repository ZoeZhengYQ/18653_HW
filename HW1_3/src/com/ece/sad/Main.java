package com.ece.sad;

public class Main {
    public static void main(String[] args) {
    	// create a builder for monkey
	    animalBuilder buildDoughMonkey = new MonkeyBuilder();
	    // create Elizebath as the player to build monkey
		PlayDoughUser Elizebath = new PlayDoughUser(buildDoughMonkey);
		// start to build monkey
		Elizebath.buildAnimal();

		// create another builder for kitten
		animalBuilder buildDoughKitten = new KittenBuilder();
		// create Elizebath as the player to build monkey
		Elizebath = new PlayDoughUser(buildDoughKitten);
		// start to build kitten
		Elizebath.buildAnimal();
    }
}
