package com.devijoe.model;

import com.devijoe.model.model_direction.CompassDirection;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EntityTest {

    EntityImpl entity;

    @Before
    public void initial() {
        Map<CompassDirection, BufferedImage> texture = new HashMap<>();
        texture.put(CompassDirection.NORTH, new BufferedImage(5, 5, 5));
        texture.put(CompassDirection.WEST, new BufferedImage(5, 5, 5));
        texture.put(CompassDirection.SOUTH, new BufferedImage(5, 5, 5));
        texture.put(CompassDirection.EAST, new BufferedImage(5, 5, 5));
        entity = new EntityImpl(4, 4, texture);
    }

    @SneakyThrows
    @Test
    public void getCurrentTexture() {
        BufferedImage expected = new BufferedImage(5, 5, 5);

        Enum key = null;
        for (Enum anEnum : entity.getTexture().keySet()) {
            key = anEnum;
        }

        if (key == null) throw new Exception("В объект типа Entity передана мустая Map для текстур");
        BufferedImage actual = entity.getTexture().get(key);
        String actualOut = actual.toString().substring(24);
        String expectedOut = expected.toString().substring(24);
        Assert.assertEquals(expectedOut, actualOut);
    }
}