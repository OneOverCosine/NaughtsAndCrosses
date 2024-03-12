package org.example;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.updateGrid(2, 0, 2);
        grid.updateGrid(2, 1, 2);
        grid.updateGrid(2, 2, 2);
        grid.updateGrid(1, 0, 0);
        grid.updateGrid(1, 0, 1);
        grid.displayGrid();
        grid.checkWinner();
    }
}