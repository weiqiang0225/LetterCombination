package org.coding;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author luoweiqiang
 */
public class LetterHelperTest {
    @Test
    public void empty_array_should_return_none(){
        int[] zero={};
        Assert.assertEquals("",LetterHelper.combination(zero));
    }

    @Test
    public void single_letter_and_array_only_contains_zero_should_return_none(){
        int[] zero={0};
        Assert.assertEquals("",LetterHelper.combination(zero));
    }

    @Test
    public void single_letter_and_array_only_contains_nine_should_return_right_str(){
        int[] nine={9};
        String mapStr="w x y z";
        Assert.assertEquals(mapStr,LetterHelper.combination(nine));
    }

    @Test
    public void single_letter_and_array_contains_two_letters_should_return_right(){
        int[] letters={2,3};
        String mapStr="ad ae af bd be bf cd ce cf";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }

    @Test
    public void single_letter_and_array_contains_two_letters_but_one_is_zero_should_return_right(){
        int[] letters={0,3};
        String mapStr="d e f";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }

    @Test
    public void single_letter_and_array_contains_three_letters_should_return_right(){
        int[] letters={0,2,3};
        String mapStr="ad ae af bd be bf cd ce cf";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }
}
