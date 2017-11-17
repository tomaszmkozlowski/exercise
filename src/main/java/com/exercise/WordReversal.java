package com.exercise;

import java.util.Arrays;
import java.util.Collections;

public class WordReversal {
    public static String reverseWords(String string) {
        String[] words = string.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
