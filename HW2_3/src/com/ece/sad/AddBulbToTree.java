package com.ece.sad;

public class AddBulbToTree extends TreeDecorator {

    public AddBulbToTree(XmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public void makeTree() {
        super.makeTree();
        addBulb();
    }

    private void addBulb() {
        System.out.println("Adding Bulb...");
    }
}
