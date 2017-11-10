package com.comcast.exercise;

public class DiamondLetter {
    public static String[] generateDiamondLetter(char letter) {
        int height = calculateDiamondHeight(letter);
        String[] diamondLetter = new String[height];
        for (int i = 0; i < height; i++) {
            diamondLetter[i] = generateDiamondLetterRow(letter, i);
        }
        return diamondLetter;
    }

    private static int calculateDiamondHeight(char letter) {
        return 2 * (letter - 'A') + 1;
    }

    private static String generateDiamondLetterRow(char letter, int row) {
        int height = calculateDiamondHeight(letter);
        int width = height;
        char rowLetter = calculateRowLetter(letter, row);
        StringBuilder sb = new StringBuilder(height);
        for (int i = 0; i < width; i++) {
            sb.append(calculateColumnLetter(letter, rowLetter, i));
        }
        return sb.toString();
    }

    private static char calculateRowLetter(char letter, int row) {
        int height = calculateDiamondHeight(letter);
        return row <= height / 2
                ? (char) ('A' + row)
                : (char) ('A' + height - row - 1);
    }

    private static char calculateColumnLetter(char letter, char rowLetter, int column) {
        int height = calculateDiamondHeight(letter);
        int columnDistanceFromMiddle = Math.abs(column - height / 2);
        int rowLetterDistanceFromMiddle = Math.abs(rowLetter - 'A');
        return columnDistanceFromMiddle == rowLetterDistanceFromMiddle
                ? rowLetter
                : '.';
    }
}
