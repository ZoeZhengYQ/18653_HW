package com.ece.sad;

public class CommandProxy implements Command {
    User user;
    RealCommand realCommand;

    public CommandProxy(User user) {
        this.user = user;
        realCommand = new RealCommand();
    }

    @Override
    public void executeCommand() {
        realCommand.executeCommand();
        if (user.isEligible()) {
            realCommand.executeSystemCommand();
        } else {
            System.out.println("User is not authorized to run system command!");
        }
    }
}
