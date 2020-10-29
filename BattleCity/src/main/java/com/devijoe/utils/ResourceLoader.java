package com.devijoe.utils;

import lombok.SneakyThrows;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Класс-утилита для загрузки и обработки "сырого" изображения в читаемый игрой формат {@code BufferedImage}
 * @author Хакимов Лев
 */
public class ResourceLoader {

    /**
     * Метод осуществляет загрузку изображения
     * @param fileName путь до файла
     * @return {@code BufferedImage} изображение
     */
    public static BufferedImage loadImage(final String fileName) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(fileName));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
