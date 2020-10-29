package com.devijoe.model.texture_module;

import com.devijoe.utils.ResourceLoader;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.SneakyThrows;

import java.awt.image.BufferedImage;

/**
 * Класс - модель, хранящий внутри себя атлас с текстурами
 * @author Хакимов Лев
 */

public class TextureAtlas {

    /** Карта с текстурами (атлас) */
    @Getter
    private final BufferedImage atlas;

    public TextureAtlas(String imageName) {
        atlas = ResourceLoader.loadImage(imageName);
    }

    /**
     * Вырезает произвольный кусок из атласа
     * @param x - координата Х (верхний левый угол)
     * @param y - координата Y (верхний левый угол)
     * @param w - ширина
     * @param h - высота
     * @return вырезанное изображение
     */
    public BufferedImage cut(int x, int y, int w, int h) {
        return atlas.getSubimage(x, y, w, h);
    }
}
