package org.example;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.displayGrid();
        grid.updateGrid(2, 2, 2);
        grid.displayGrid();
    }
}