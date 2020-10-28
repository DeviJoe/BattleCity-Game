package com.devijoe.model;

import org.junit.Assert;
import org.junit.Test;


public class PositionTest {

    @Test
    public void absoluteUpdate() {
        Position expected = new Position(3.4, 5.6, 40, 50);
        expected.absoluteUpdate(8, 10);
        Position actual = new Position(8, 10, 40, 50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void vectorUpdate() {
        Position expected = new Position(3.4, 5.6, 40, 50);
        expected.vectorUpdate(2.6, -0.6);
        Position actual = new Position(6, 5, 40, 50);
        Assert.assertEquals(expected, actual);
    }
}