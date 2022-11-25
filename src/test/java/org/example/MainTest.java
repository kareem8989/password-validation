package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    void checkLenngth() {
        //give
        String str = "musli3";

        // When
        String  actual = Main.checkLengthAndContainsNum(str);

        // then
        assertEquals("You have to give bigger longer password then: "+str.length()+"\n",actual);
    }

    @Test
    void containsNoNums() {
        //give
        String str = "musliueiur";

        // When
        String  actual = Main.checkLengthAndContainsNum(str);

        // then
        assertEquals("Your password must contains numbers",actual);
    }



    @Test
    void containsNoNumsAndSmallerThen8() {
        //give
        String str = "murr";

        // When
        String  actual = Main.checkLengthAndContainsNum(str);

        // then
        assertEquals("You have to give bigger longer password then: " + str.length() + "\n"
                            + "Your password must contains numbers",actual);
    }

}