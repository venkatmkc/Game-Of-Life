package com.pathashala.gameoflife;

public class Cell {
    private int row, column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cell cell = (Cell) o;

        return row == cell.row && column == cell.column;

    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + column;
        return result;
    }
}
