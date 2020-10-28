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
    int hp;

    /** Скорость */
    @Getter @Setter
    int speed;

    /** Система управления танком */
    @Getter
    final Control control;

    /** Чекбокс на то, подконтролен ли танк игроку */
    @Getter @Setter
    boolean isPlayer;

    public Tank(double x, double y, Map<? extends CompassDirection, BufferedImage> texture, int hp, int speed, Control control) {
        super(x, y, texture);
        this.hp = hp;
        this.speed = speed;
        this.control = control;
        this.isPlayer = false;
    }

    public Tank(double x, double y, Map<? extends CompassDirection, BufferedImage> texture, int hp, int speed, Control control, boolean isPlayer) {
        this(x, y, texture, hp, speed, control);
        this.isPlayer = isPlayer;
    }


}
