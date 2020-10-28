package com.devijoe.model;

import com.devijoe.model.model_direction.CompassDirection;

import java.awt.image.BufferedImage;
import java.util.Map;

public class EntityImpl extends Entity {
    public EntityImpl(double x, double y, Map<CompassDirection, BufferedImage> texture) {
        super(x, y, texture);
    }
}
