package com.comcast.exercise;

import org.junit.Assert;
import org.junit.Test;

public class DiamondLetterTest {
    @Test
    public void testOneRowDiamond() {
        String[] diamondLetter = DiamondLetter.generateDiamondLetter('A');
        Assert.assertArrayEquals(new String[] {"A"}, diamondLetter);
    }

    @Test
    public void testTwoRowDiamond() {
        String[] diamondLetter = DiamondLetter.generateDiamondLetter('B');
        Assert.assertArrayEquals(new String[] {
                ".A.",
                "B.B",
                ".A."},
                diamondLetter);
    }

    @Test
    public void testThreeRowDiamond() {
        String[] diamondLetter = DiamondLetter.generateDiamondLetter('C');
        Assert.assertArrayEquals(new String[] {
                "..A..",
                ".B.B.",
                "C...C",
                ".B.B.",
                "..A.."},
                diamondLetter);
    }

    @Test
    public void testFourRowDiamond() {
        String[] diamondLetter = DiamondLetter.generateDiamondLetter('D');
        Assert.assertArrayEquals(new String[] {
                        "...A...",
                        "..B.B..",
                        ".C...C.",
                        "D.....D",
                        ".C...C.",
                        "..B.B..",
                        "...A..."},
                diamondLetter);
    }
}
