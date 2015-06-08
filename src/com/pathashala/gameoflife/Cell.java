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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cell cell = (Cell) o;

        if (row != cell.row)
            return false;
        return column == cell.column;

    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + column;
        return result;
    }
}
