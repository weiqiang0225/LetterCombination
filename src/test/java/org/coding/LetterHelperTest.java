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

    @Test
    public void two_letter_and_array_contains_one_letters_should_return_right(){
        int[] letters={23};
        String mapStr="ad ae af bd be bf cd ce cf";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }

    @Test
    public void two_letter_and_array_contains_two_letters_should_return_right(){
        int[] letters={0,23};
        String mapStr="ad ae af bd be bf cd ce cf";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }

    @Test
    public void two_letter_and_array_contains_three_letters_should_return_right(){
        int[] letters={1,23,99};
        String mapStr="adww adwx adwy adwz adxw adxx adxy adxz adyw adyx adyy adyz adzw adzx adzy adzz aeww aewx aewy aewz aexw aexx aexy aexz aeyw aeyx aeyy aeyz aezw aezx aezy aezz afww afwx afwy afwz afxw afxx afxy afxz afyw afyx afyy afyz afzw afzx afzy afzz bdww bdwx bdwy bdwz bdxw bdxx bdxy bdxz bdyw bdyx bdyy bdyz bdzw bdzx bdzy bdzz beww bewx bewy bewz bexw bexx bexy bexz beyw beyx beyy beyz bezw bezx bezy bezz bfww bfwx bfwy bfwz bfxw bfxx bfxy bfxz bfyw bfyx bfyy bfyz bfzw bfzx bfzy bfzz cdww cdwx cdwy cdwz cdxw cdxx cdxy cdxz cdyw cdyx cdyy cdyz cdzw cdzx cdzy cdzz ceww cewx cewy cewz cexw cexx cexy cexz ceyw ceyx ceyy ceyz cezw cezx cezy cezz cfww cfwx cfwy cfwz cfxw cfxx cfxy cfxz cfyw cfyx cfyy cfyz cfzw cfzx cfzy cfzz";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }

    @Test
    public void multi_letter_and_array_contains_multi_letters_should_return_right(){
        int[] letters={123,99};
        String mapStr="adww adwx adwy adwz adxw adxx adxy adxz adyw adyx adyy adyz adzw adzx adzy adzz aeww aewx aewy aewz aexw aexx aexy aexz aeyw aeyx aeyy aeyz aezw aezx aezy aezz afww afwx afwy afwz afxw afxx afxy afxz afyw afyx afyy afyz afzw afzx afzy afzz bdww bdwx bdwy bdwz bdxw bdxx bdxy bdxz bdyw bdyx bdyy bdyz bdzw bdzx bdzy bdzz beww bewx bewy bewz bexw bexx bexy bexz beyw beyx beyy beyz bezw bezx bezy bezz bfww bfwx bfwy bfwz bfxw bfxx bfxy bfxz bfyw bfyx bfyy bfyz bfzw bfzx bfzy bfzz cdww cdwx cdwy cdwz cdxw cdxx cdxy cdxz cdyw cdyx cdyy cdyz cdzw cdzx cdzy cdzz ceww cewx cewy cewz cexw cexx cexy cexz ceyw ceyx ceyy ceyz cezw cezx cezy cezz cfww cfwx cfwy cfwz cfxw cfxx cfxy cfxz cfyw cfyx cfyy cfyz cfzw cfzx cfzy cfzz";
        Assert.assertEquals(mapStr,LetterHelper.combination(letters));
    }
}
