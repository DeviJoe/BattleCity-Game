package com.devijoe.model;

import lombok.Data;

/**
 * Объект точки на координатной плоскости
 * @author Хакимов Лев
 */
@Data
public class Point {

    /** Координата Х */
    private double x;

    /** Координата У */
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

}
