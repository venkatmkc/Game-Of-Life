package com.pathashala.gameoflife;

import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CellTest {
    @Test
    public void numberOfNeighboursShouldBeZeroWhenThereAreNoNeighbours() {
        Cell cell = new Cell(1, 2);

        int actualNumberOfNeighbours = cell.numberOfNeighbours();

        assertThat(actualNumberOfNeighbours, is(equalTo(0)));
    }

    @Test
    public void reflexivityTestShouldBePassed() {
        Cell actualCell = new Cell(1, 2);

        assertThat(actualCell, is(equalTo(actualCell)));
    }

    @Test
    public void comparingNullObjectsShouldBeSupported() {
        Cell actualCell = new Cell(1, 2);

        assertThat(actualCell, is(not(equalTo(null))));
    }

    @Test
    public void comparingOtherTypeObjectsShouldBeSupported() {
        Cell actualCell = new Cell(1, 2);
        Object five = new Integer(5);

        assertThat(actualCell, is(not(equalTo(five))));
    }

    @Test
    public void equalityShouldBeSatisfied() {
        Cell cellOne = new Cell(1, 2);
        Cell cellTwo = new Cell(1, 2);

        assertThat(cellOne, is(equalTo(cellTwo)));
    }

    @Test
    public void equalCellsShouldHaveEqualHashCode() {
        Cell cellOne = new Cell(1, 3);
        Cell cellTwo = new Cell(1, 3);
        
        assertThat(cellOne.hashCode(), is(equalTo(cellTwo.hashCode())));
    }
}
