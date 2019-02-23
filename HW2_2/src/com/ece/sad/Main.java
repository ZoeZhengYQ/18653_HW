package com.ece.sad;
import java.util.Random;

public class Main {
    private static final String chars[] = {"a", "1", "?"};
    private static final String fonts[] = {"Georgia", "Times New Roman"};
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Character c = null;

        // first time all the character should be created
        for (int i = 0; i < chars.length; ++i) {
            for (int j = 0; j < fonts.length; ++j) {
                c = CharacterFactory.getChar(chars[i], fonts[j]);
                c.setLocation(getRandom(), getRandom());
                c.print();
            }
        }

        System.out.println("");

        // second time they should only be loaded not created
        for (int i = 0; i < chars.length; ++i) {
            for (int j = 0; j < fonts.length; ++j) {
                c = CharacterFactory.getChar(chars[i], fonts[j]);
                c.setLocation(getRandom(), getRandom());
                c.print();
            }
        }

        System.out.println("");
        // test a new character
        c = CharacterFactory.getChar("z", "Calibri");
        c.setLocation(getRandom(), getRandom());
        c.print();
    }

    private static int getRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt(50);
        return randomNum;
    }
}
