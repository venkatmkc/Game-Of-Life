package com.pathashala.gameoflife;

import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class GridTest {
    @Test
    public void numberOfNeighboursShouldBeZeroWhenThereAreNoNeighbours() {
        Cell cell = new Cell(1, 2);
        HashSet<Cell> cells = new HashSet<Cell>();
        cells.add(cell);
        Grid grid = new Grid(cells);

        int actualNumberOfNeighbours = grid.numberOfNeighbours();

        assertThat(actualNumberOfNeighbours, is(equalTo(0)));
    }

}
