package com.exercise;

import org.junit.Assert;
import org.junit.Test;

public class WordReversalTest {
    @Test
    public void reverseEmptyString() {
        Assert.assertEquals(WordReversal.reverseWords(""), "");
    }

    @Test
    public void reverseOneWordString() {
        Assert.assertEquals(WordReversal.reverseWords("one"), "one");
    }

    @Test
    public void reverseTwoWordString() {
        Assert.assertEquals(WordReversal.reverseWords("one two"), "two one");
    }

    @Test
    public void reverseFiveWordString() {
        Assert.assertEquals(WordReversal.reverseWords("one two three four five"), "five four three two one");
    }
}
