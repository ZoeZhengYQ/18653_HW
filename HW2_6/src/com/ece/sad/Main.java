package com.ece.sad;

public class Main {

    public static void main(String[] args) {

	    RobotContext Tom = new RobotContext(new FightingRobot("Tom"));
	    RobotContext Mary = new RobotContext(new SingingRobot("Mary"));
	    RobotContext Linda = new RobotContext(new ReadingRobot("Linda"));

	    System.out.print("Fighting Robot: ");
	    Tom.playRobot("shoots a bullet");

        System.out.print("Singing Robot: ");
        Mary.playRobot("a song");

        System.out.print("Reading Robot: ");
        Linda.playRobot("a book");
    }
}
