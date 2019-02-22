package com.ece.sad;

public class SingingRobot implements Robot {
    private String name;

    public SingingRobot(String name) {
        this.name = name;
    }

    @Override
    public void doAction(String songName) {
        System.out.println(this.name + " sings " + songName);
    }
}
