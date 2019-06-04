package org.coding;

import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author luoweiqiang
 */
public class LetterHelper {
    private final static String[] LETTER_MAP = {"", "", "a b c", "d e f", "g h i", "j k l", "m n o", "p q r s", "t u v", "w x y z"};

    /**
     * Letter combination
     *
     * @param letters
     * @return String
     */
    public static String combination(int[] letters) {
        if (letters.length == 0) {
            return "";
        }
        //prepare
        List<Set<String>> setList = getCalculateCartesianProductList(letters);
        //calculate
        Set<List<String>> lists = Sets.cartesianProduct(setList);
        //result
        return parseLetterCombination(lists);
    }

    /**
     * 计算笛卡尔积
     *
     * @param letters
     * @return
     */
    private static List<Set<String>> getCalculateCartesianProductList(int[] letters) {
        List<Set<String>> result = new LinkedList<>();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] < 10) {
                Set<String> strings = new LinkedHashSet<>(Arrays.asList(LETTER_MAP[letters[i]].split(" ")));
                result.add(strings);
            } else {
                String[] split = String.valueOf(letters[i]).split("");
                for (int j = 0; j < split.length; j++) {
                    Set<String> strings = new LinkedHashSet<>(Arrays.asList(LETTER_MAP[Integer.parseInt(split[j])].split(" ")));
                    result.add(strings);
                }
            }
        }
        return result;
    }

    /**
     * 提取（笛卡尔积）字符串组合
     *
     * @param lists
     * @return
     */
    private static String parseLetterCombination(Set<List<String>> lists) {
        StringBuffer result = new StringBuffer();
        for (List<String> itemList : lists) {
            String combStr = "";
            for (String item : itemList) {
                combStr += item;
            }
            result.append(combStr).append(" ");
        }
        return result.toString().trim();
    }
}
