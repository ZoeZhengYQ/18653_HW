package com.ece.sad;

public class PlayDoughUser {
    private animalBuilder buildPlayDoughAnimal;

    /**
     * Construct the User with object in {@code animalBuilder} class
     *  this is used to determined which animal to build
     * @param buildDoughAnimal is used to determine which animal to build
     */
    public PlayDoughUser(animalBuilder buildDoughAnimal) {
        this.buildPlayDoughAnimal = buildDoughAnimal;
    }

    /**
     * The real process of building a play-dough animal mold
     */
    public void buildAnimal() {
        this.buildPlayDoughAnimal.buildHead();
        this.buildPlayDoughAnimal.buildBody();
        this.buildPlayDoughAnimal.buildLeg();
        this.buildPlayDoughAnimal.buildArm();
        this.buildPlayDoughAnimal.buildTail();
        this.buildPlayDoughAnimal.glue();
    }


}

