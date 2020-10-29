package com.devijoe.model;

import com.devijoe.model.model_direction.CompassDirection;
import com.devijoe.service.control.Control;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Класс - модель, декларирующий поля танка
 * @author Хакимов Лев
 */
@EqualsAndHashCode(callSuper = false)
public class Tank extends Entity {

    /** Количество очков здоровья */
    @Getter @Setter
    private int hp;

    /** Скорость */
    @Getter @Setter
    private int speed;

    /** Система управления танком */
    @Getter
    private final Control control;

    /** Чекбокс на то, подконтролен ли танк игроку */
    @Getter @Setter
    private boolean isPlayer;

    public Tank(double x, double y, Map<? extends CompassDirection, BufferedImage> texture, int hp, int speed, Control control) throws Exception {
        super(x, y, texture);
        this.hp = hp;
        this.speed = speed;
        this.control = control;
        this.isPlayer = false;
    }

    public Tank(double x, double y, Map<? extends CompassDirection, BufferedImage> texture, int hp, int speed, Control control, boolean isPlayer) throws Exception {
        this(x, y, texture, hp, speed, control);
        this.isPlayer = isPlayer;
    }


}
