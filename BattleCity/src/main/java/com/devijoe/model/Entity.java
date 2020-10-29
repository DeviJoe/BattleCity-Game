package com.devijoe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.SneakyThrows;

import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Класс - модель, декларирующий стандартную структуру объекта
 * @author Хакимов Лев
 */
@EqualsAndHashCode
public abstract class Entity {

    /** Хитбокс объекта */
    @Getter
    private final Hitbox hitbox;

    /** Карта, хранящая текстуры объекта в зависимости от их направления */
    @Getter
    private final Map<? extends Enum, BufferedImage> texture;


    public Entity(double x, double y, Map<? extends Enum, BufferedImage> texture) throws Exception {
        this.texture = texture;

        Enum key = null;
        for (Enum anEnum : texture.keySet()) {
            key = anEnum;
        }
        if (key == null) throw new Exception("В объект типа Entity передана мустая Map для текстур");

        BufferedImage img = texture.get(key);
        this.hitbox = new Hitbox(x, y, img.getWidth(), img.getHeight());
    }
}
