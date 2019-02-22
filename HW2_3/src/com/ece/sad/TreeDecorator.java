package com.ece.sad;

public abstract class TreeDecorator implements XmasTree{
    protected XmasTree decoratedTree;

    public TreeDecorator(XmasTree tree) {
        this.decoratedTree = tree;
    }

    public void makeTree() {
        decoratedTree.makeTree();
    }
}
