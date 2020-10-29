package com.devijoe.service;

import com.devijoe.model.texture_module.TextureAtlas;
import com.devijoe.model.texture_module.TextureType;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * Singleton сервис, порождающий текстуры вида {@code map} для объектов
 * @author Хакимов Лев
 */
public class TextureService {

    /** Реализация паттерна Singleton */
    public static TextureService service;

    public static TextureService getInstance() {
        TextureService localInstance = service;
        if (localInstance == null) {
            synchronized (TextureService.class) {
                localInstance = service;
                if (localInstance == null) {
                    service = localInstance = new TextureService();
                }
            }
        }
        return localInstance;
    }

    /** Атлас с текстурой */
    private TextureAtlas atlas = new TextureAtlas("src/main/resources/texture/texture_atlas.png");

    /**
     * Метод создает Map с текстурами для конкретного объекта - модели
     * @param type
     * @return Map с текстурами
     */
    public Map<Enum, BufferedImage> createTextureMap(TextureType type) {
        //enums.get
        Map<Enum, BufferedImage> texture = new HashMap<>();

        for (TextureType.Container container : type.getTextureContext()) {
            texture.put(container.getAnEnum(), atlas.cut(
                    container.getX(),
                    container.getY(),
                    container.getW(),
                    container.getH()
            ));
        }

        return texture;
    }
}
