package com.ece.sad;

public class RealCommand implements Command {
    @Override
    public void executeCommand() {
        System.out.println("Running Command...");
    }

    protected void executeSystemCommand() {
        System.out.println("Running System Command...");
    }
}
