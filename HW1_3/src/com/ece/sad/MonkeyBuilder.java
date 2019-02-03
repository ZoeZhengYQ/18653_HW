package com.ece.sad;

/**
 * class that implement interface {@code animalBuilder}
 */

public class MonkeyBuilder implements animalBuilder {
    private doughAnimal Monkey;

    public MonkeyBuilder() {
        this.Monkey = new Monkey();
    }

    @Override
    public void buildHead() {
        this.Monkey.setHead("Monkey's head");
    }

    @Override
    public void buildBody() {
        this.Monkey.setBody("Monkey's body");
    }

    @Override
    public void buildLeg() {
        this.Monkey.setLeg("Monkey's leg");
    }

    @Override
    public void buildArm() {
        this.Monkey.setArm("Monkey's arm");
    }

    @Override
    public void buildTail() {
        this.Monkey.setTail("Monkey's tail");
    }

    @Override
    public void glue() {
        this.Monkey.canEat();
    }
}
