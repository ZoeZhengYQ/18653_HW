package com.ece.sad;

public class ReadingRobot implements Robot {
    private String name;

    public ReadingRobot(String name) {
        this.name = name;
    }

    @Override
    public void doAction(String bookName) {
        System.out.println(this.name + " reads " + bookName);
    }
}
