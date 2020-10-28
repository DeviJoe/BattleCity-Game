package com.devijoe.model;

import org.junit.Assert;
import org.junit.Test;


public class HitboxTest {

    @Test
    public void absoluteUpdate() {
        Hitbox expected = new Hitbox(3.4, 5.6, 40, 50);
        expected.absoluteUpdate(8, 10);
        Hitbox actual = new Hitbox(8, 10, 40, 50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void vectorUpdate() {
        Hitbox expected = new Hitbox(3.4, 5.6, 40, 50);
        expected.vectorUpdate(2.6, -0.6);
        Hitbox actual = new Hitbox(6, 5, 40, 50);
        Assert.assertEquals(expected, actual);
    }
}