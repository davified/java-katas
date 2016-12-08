package com.katas;/* Created by davified on 8/12/16. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters, - each taken only once - coming from s1 or s2.

//        a = "xyaabbbccccdefww"
//        b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"
//
//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

public class StringSort {
    public static StringBuilder longest(String s1, String s2) {
//        return "abcdefklmopqwxy";
        ArrayList<String> s1Array;
        s1Array = new ArrayList<String>(Arrays.asList(s1.split("(?!^)")));
        ArrayList<String> s2Array = new ArrayList<String>(Arrays.asList(s2.split("(?!^)")));
        ArrayList<String> mergedArray = new ArrayList<String>();
        mergedArray.addAll(s1Array);
        mergedArray.addAll(s2Array);
        Collections.sort(mergedArray);
        ArrayList<String> output = new ArrayList<String>();

        for (String c: mergedArray) {
            if (output.contains(c)) {

            } else {
                output.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : output)
        {
            sb.append(s);
            sb.append("\t");
        }

//        System.out.println(output);
        return sb;
    }
}
