package com.ece.sad;

/**
 * class that implement interface {@code doughAnimal}
 */

public class Kitten implements doughAnimal{
    private String kittenHead;
    private String kittenBody;
    private String kittenLeg;
    private String kittenArm;
    private String kittenTail;

    public Kitten() {
        System.out.println("Elizabeth start making a kitten.");
    }

    @Override
    public void setHead(String head) {
        this.kittenHead = head;
        System.out.println("Kitten's head has been built.");
    }

    @Override
    public void setBody(String body) {
        this.kittenBody = body;
        System.out.println("Kitten's body has been built.");
    }

    @Override
    public void setLeg(String leg) {
        this.kittenLeg = leg;
        System.out.println("Kitten's leg has been built.");
    }

    @Override
    public void setArm(String arm) {
        this.kittenArm = arm;
        System.out.println("Kitten's arm has been built.");
    }

    @Override
    public void setTail(String tail) {
        this.kittenTail = tail;
        System.out.println("Kitten's tail has been built.");
    }

    @Override
    public void canEat() {
        if (kittenHead != null && kittenBody != null && kittenLeg != null && kittenArm != null && kittenTail != null)
            System.out.println("Since I am a Kitten I want to eat kitten food.");
        else
            System.out.println("I am not a complete kitten ;(");
    }
}