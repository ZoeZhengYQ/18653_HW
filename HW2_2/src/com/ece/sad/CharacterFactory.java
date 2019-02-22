package com.ece.sad;

import java.util.HashMap;

public class CharacterFactory {
    private static final HashMap<String, GeneralCharacter> charMap = new HashMap<>();

    public static Character getChar (String content, String font) {
        String k = content + font;
        Character c = (Character) charMap.get(k);
        if (c == null) {
            c = new Character(content, font);
            charMap.put(content + font, c);
            System.out.println("Creating character " + "\"" + content + "\", font is " + font);
        }
        return c;
    }
}
