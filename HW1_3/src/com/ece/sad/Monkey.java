package com.ece.sad;

/**
 * class that implement interface {@code doughAnimal}
 */

public class Monkey implements doughAnimal{
    private String monkeyHead;
    private String monkeyBody;
    private String monkeyLeg;
    private String monkeyArm;
    private String monkeyTail;

    public Monkey() {
        System.out.println("Elizabeth start making a monkey.");
    }

    @Override
    public void setHead(String head) {
        this.monkeyHead = head;
        System.out.println("Monkey's head has been built.");
    }

    @Override
    public void setBody(String body) {
        this.monkeyBody = body;
        System.out.println("Monkey's body has been built.");
    }

    @Override
    public void setLeg(String leg) {
        this.monkeyLeg = leg;
        System.out.println("Monkey's leg has been built.");
    }

    @Override
    public void setArm(String arm) {
        this.monkeyArm = arm;
        System.out.println("Monkey's arm has been built.");
    }

    @Override
    public void setTail(String tail) {
        this.monkeyTail = tail;
        System.out.println("Monkey's tail has been built.");
    }

    @Override
    public void canEat() {
        if (this.monkeyHead != null && this.monkeyBody != null && this.monkeyLeg != null && this.monkeyArm != null && this.monkeyTail != null)
            System.out.println("Since I am a monkey I want to eat banana.");
        else
            System.out.println("I am not a complete monkey ;(");
    }
}

