package com.ece.sad;

public class Character implements GeneralCharacter {
    private String content;
    private int row;
    private int col;
    private String font;

    public Character(String s, String font) {
        this.content = s;
        this.font = font;
    }

    public void setLocation(int r, int c) {
        this.row = r;
        this.col = c;
    }

    @Override
    public void print() {
        System.out.println("Printing character " + this.content + " at (" + this.row + ", " + this.col + ")  Font: " + this.font);
    }
}
