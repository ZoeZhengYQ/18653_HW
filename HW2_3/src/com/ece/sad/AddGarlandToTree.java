package com.ece.sad;

public class AddGarlandToTree extends TreeDecorator {
    public AddGarlandToTree(XmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public void makeTree() {
        super.makeTree();
        addGarland();
    }

    private void addGarland() {
        System.out.println("Adding Garland...");
    }
}
