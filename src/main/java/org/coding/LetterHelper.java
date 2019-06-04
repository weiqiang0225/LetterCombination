package org.coding;

/**
 * @author luoweiqiang
 */
public class LetterHelper {
    private final static String[] LETTER_MAP={"","","a b c","d e f","g h i","j k l","m n o","p q r s","t u v","w x y z"};

    public static String combination(int[] letters){
        return LETTER_MAP[letters[0]];
    }
}
