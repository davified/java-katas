package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/* Created by davified on 8/12/16. */
public class StringSortTest {
    @Test
    public void longestTest() throws Exception {
        StringSort s = new StringSort();

        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        String expected = "abcdefklmopqwxy";
        assertEquals(expected, s.longest(a,b));
    }

}