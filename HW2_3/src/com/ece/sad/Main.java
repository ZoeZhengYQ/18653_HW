package com.ece.sad;

public class Main {

    public static void main(String[] args) {

        XmasTree basicTree = new BasicComponent();
        XmasTree bulbTree = new AddBulbToTree(new BasicComponent());
        XmasTree candyTree = new AddCandyToTree(new BasicComponent());
        XmasTree garlandTree = new AddGarlandToTree(new BasicComponent());

        System.out.println("Basic Component");
        basicTree.makeTree();

        System.out.println("\nTree + bulb ");
        bulbTree.makeTree();

        System.out.println("\nTree + candy");
        candyTree.makeTree();

        System.out.println("\nTree + garland");
        garlandTree.makeTree();
    }
}
