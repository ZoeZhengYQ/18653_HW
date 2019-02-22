package com.ece.sad;

public class Main {

    public static void main(String[] args) {
		User admin = new Admin();
		User normalUser = new NormalUser();

		Command adminCommand = new CommandProxy(admin);
		Command normalCommand = new CommandProxy(normalUser);

		System.out.println("Admin run command...");
		adminCommand.executeCommand();

		System.out.println("\nNormal User run command...");
		normalCommand.executeCommand();
    }
}
