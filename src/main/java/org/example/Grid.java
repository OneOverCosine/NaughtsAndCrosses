package org.example;

import java.util.Arrays;

public class Grid {
    private int[][] grid = new int[3][3];

    public void displayGrid() {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row)); // doesn't look very much like naughts and crosses, but it works for now
        }
    }

    public void updateGrid(int playerInput, int row, int col) {
        grid[row][col] = playerInput;
    }

    public int checkWinner() {
        // it works...
        int[][][] linesToCheck = {
                {{0,0}, {0,1}, {0,2}}, {{1,0}, {1,1}, {1,2}}, {{2,0}, {2,1}, {2,2}}, {{0,0}, {1,0}, {2,0}},
                {{0,1}, {1,1}, {2,1}}, {{0,2}, {1,2}, {2,2}}, {{0,2}, {1,1}, {2,0}}, {{0,0}, {1,1}, {2,2}}};

        for (int[][] line : linesToCheck) {
            int value = 1;

            for (int[] coord : line) {
                value *= grid[coord[0]][coord[1]];
            }

            if (value == 1 || value == 8) return value;

            System.out.println("The value of this line is " + value);
        }

        return -1;
    }
}
