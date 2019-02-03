package com.ece.sad;

/**
 * class that implement interface {@code animalBuilder}
 */

public class KittenBuilder implements animalBuilder {
    private doughAnimal Kitten;

    public KittenBuilder() {
        this.Kitten = new Kitten();
    }

    @Override
    public void buildHead() {
        this.Kitten.setHead("Kitten's head");
    }

    @Override
    public void buildBody() {
        this.Kitten.setBody("Kitten's body");
    }

    @Override
    public void buildLeg() {
        this.Kitten.setLeg("Kitten's leg");
    }

    @Override
    public void buildArm() {
        this.Kitten.setArm("Kitten's arm");
    }

    @Override
    public void buildTail() {
        this.Kitten.setTail("Kitten's tail");
    }

    @Override
    public void glue() {
        this.Kitten.canEat();
    }
}
