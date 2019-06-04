package org.coding;

import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author luoweiqiang
 */
public class LetterHelper {
    private final static String[] LETTER_MAP={"","","a b c","d e f","g h i","j k l","m n o","p q r s","t u v","w x y z"};

    public static String combination(int[] letters){
        if (letters.length==0){
            return "";
        }
        StringBuffer result=new StringBuffer();
        List<Set<String>> setList=new LinkedList<>();
        for(int i=0;i<letters.length;i++){
            Set<String> strings=new LinkedHashSet<>(Arrays.asList(LETTER_MAP[letters[i]].split(" ")));
            setList.add(strings);
        }
        Set<List<String>> lists = Sets.cartesianProduct(setList);
        for (List<String> itemList:lists){
            String combStr="";
            for (String item:itemList){
                combStr+=item;
            }
            result.append(combStr).append(" ");
        }
        return result.toString().trim();
    }
}
