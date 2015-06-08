package com.pathashala.gameoflife;

import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CellTest {
    @Test
    public void numberOfNeighboursShouldBeZeroWhenThereAreNoNeighBours() {
        Cell cell = new Cell(1, 2);

        int actualNumberOfNeighbours = cell.numberOfNeighbours();

        assertThat(actualNumberOfNeighbours, is(equalTo(0)));
    }

}
