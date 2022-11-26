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
        assertEquals("You have to give longer password then: "+str.length()+"\n",actual);
    }

    @Test
    void containsNoNums() {
        //give
        String str = "musliueiur";

        // When
        String  actual = Main.checkLengthAndContainsNum(str);

        // then
        assertEquals("Your password must contains numbers.",actual);
    }



    @Test
    void containsNoNumsAndSmallerThen8() {
        //give
        String str = "mu";

        // When
        String  actual = Main.checkLengthAndContainsNum(str);

        // then
        assertEquals("You have to give longer password then: " + str.length() + "\n"
                            + "Your password must contains numbers.",actual);
    }

}