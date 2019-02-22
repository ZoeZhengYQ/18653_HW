package com.ece.sad;

public class FightingRobot implements Robot{
    private String name;

    public FightingRobot(String name) {
        this.name = name;
    }

    @Override
    public void doAction(String act) {
        System.out.println(this.name + " " + act);
    }
}
