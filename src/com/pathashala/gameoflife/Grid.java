package com.pathashala.gameoflife;

import java.util.HashSet;

public class Grid {
    HashSet<Cell> grid;

    public Grid(HashSet<Cell> grid) {
        this.grid = grid;
    }

    public int numberOfNeighbours() {
        return 0;
    }
}
