package com.ece.sad;

/**
 * interface of an animal builder
 * could build 5 parts of the body
 * and have one function to finally glue the parts together
 */

public interface animalBuilder {
    void buildHead();
    void buildBody();
    void buildLeg();
    void buildArm();
    void buildTail();
    void glue();
}
