package com.pathashala.gameoflife;

public class Cell {
    private int row, column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int numberOfNeighbours() {
        return 0;
    }
}
