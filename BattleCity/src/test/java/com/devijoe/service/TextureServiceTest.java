package com.devijoe.service;

import com.devijoe.model.model_direction.CompassDirection;
import com.devijoe.model.texture_module.TextureType;
import com.devijoe.utils.ResourceLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author Хакимов Лев
 */
public class TextureServiceTest {

    TextureService service;

    @Before
    public void configure() {
        service = TextureService.getInstance();
    }

    @Test
    public void createTextureMap() {
        Map<Enum, BufferedImage> expected = service.createTextureMap(TextureType.YELLOW_STANDARD_TANK);
        Map<Enum, BufferedImage> actual = new HashMap<>();
        actual.put(CompassDirection.NORTH, ResourceLoader.loadImage("src/main/resources/testing_files/texture/UP.png"));
        actual.put(CompassDirection.SOUTH, ResourceLoader.loadImage("src/main/resources/testing_files/texture/DOWN.png"));
        actual.put(CompassDirection.EAST, ResourceLoader.loadImage("src/main/resources/testing_files/texture/LEFT.png"));
        actual.put(CompassDirection.WEST, ResourceLoader.loadImage("src/main/resources/testing_files/texture/RIGHT.png"));

        for (CompassDirection direction : CompassDirection.values()) {
            if (!BufferedImageComparator.compareImages(actual.get(direction), expected.get(direction))) fail();
        }
    }
}