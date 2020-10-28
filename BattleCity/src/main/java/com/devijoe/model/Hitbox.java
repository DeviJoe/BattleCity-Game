package com.devijoe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Позиционная система прямоугольных объектов на плоскости
 * @author Хакимов Лев
 */
@EqualsAndHashCode
public class Hitbox {

    /** Идет перечисление точек - вершин прямоугольника */
    @Getter
    private Point DownLeft;
    @Getter
    private Point UpLeft;
    @Getter
    private Point UpRight;
    @Getter
    private Point DownRight;

    /** Ширина модели */
    @Getter @Setter
    private double width;

    /** Высота модели */
    @Getter @Setter
    private double height;

    public Hitbox(final double x, final double y, final double width, final double height) {
        this.width = width;
        this.height = height;
        UpLeft = new Point(x, y);
        UpRight = new Point(x + width, y);
        DownLeft = new Point(x, y - height);
        DownRight = new Point(x + width, y - height);
    }

    /**
     * Метод обновляет значения всех координат по абсолютному принципу (перемещает объект в указанную точку)
     * @param x координата Х верхнего левого угла
     * @param y координата У верхнего левого угла
     */
    public void absoluteUpdate(final double x, final double y) {
            UpLeft.setX(x);
            UpLeft.setY(y);
            UpRight.setX(x + width);
            UpRight.setY(y);
            DownLeft.setX(x);
            DownLeft.setY(y - height);
            DownRight.setX(x + width);
            DownRight.setY(y - height);
    }

    /**
     * Осуществляет сдвиг объекта на вектор сдвига {@code vector(x, y)}
     * @param x - координата X вектора сдвига
     * @param y - координата Y вектора сдвига
     */
    public void vectorUpdate(final double x, final double y) {
        double absoluteX = UpLeft.getX() + x;
        double absoluteY = UpLeft.getY() + y;
        absoluteUpdate(absoluteX, absoluteY);
    }

}
