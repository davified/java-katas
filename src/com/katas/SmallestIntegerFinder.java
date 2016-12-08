package com.katas;/* Created by davified on 8/12/16. */

import java.util.Arrays;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
