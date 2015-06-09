package com.pathashala.gameoflife;

import java.util.HashSet;

public class Grid {
    HashSet<Cell> aliveCells;

    public Grid(HashSet<Cell> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public int numberOfAliveNeighbours(Cell cell) {
        return 0;
    }
}
