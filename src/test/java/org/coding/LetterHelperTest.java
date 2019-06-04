package org.coding;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author luoweiqiang
 */
public class LetterHelperTest {

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
}
