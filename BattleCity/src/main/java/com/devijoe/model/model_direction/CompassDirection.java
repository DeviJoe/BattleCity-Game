package com.devijoe.model.model_direction;

import lombok.Getter;

/**
 * Направление движения по сторонам света
 * @author Хакимов Лев
 */
public enum CompassDirection {

    /** Север */
    NORTH(0),
    /** Запад */
    EAST(270),
    /** Юг */
    SOUTH(180),
    /** Восток */
    WEST(90);

    /** Угол поворота */
    @Getter
    private double angle;

    private CompassDirection(final double angle) {
        this.angle = angle;
    }
}
