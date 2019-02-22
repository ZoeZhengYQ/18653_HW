package com.ece.sad;

public class AddCandyToTree extends TreeDecorator{

    public AddCandyToTree(XmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public void makeTree() {
        super.makeTree();
        addCandy();
    }

    private void addCandy() {
        System.out.println("Adding Candy...");
    }
}
