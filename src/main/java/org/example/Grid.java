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
        return -1;
    }
}
