package com.ece.sad;

/**
 * interface of a play-dough animal
 * have 5 APIs to build part of the body
 * and the {@code canEat} function is used to check if animal has been built successfully
 */
public interface doughAnimal {
    void setHead(String head);
    void setBody(String body);
    void setLeg(String leg);
    void setArm(String arm);
    void setTail(String tail);
    void canEat();
}