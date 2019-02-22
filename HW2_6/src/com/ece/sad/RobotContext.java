package com.ece.sad;

public class RobotContext {
    private Robot robot;

    public RobotContext(Robot robot) {
        this.robot = robot;
    }

    public void playRobot(String str) {
        robot.doAction(str);
    }
}
