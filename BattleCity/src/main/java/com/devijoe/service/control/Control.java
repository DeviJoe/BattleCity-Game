package com.devijoe.service.control;

import java.awt.event.KeyListener;

/**
 * Класс декларирует основные методы управления танком
 */
public interface Control extends KeyListener {

    /**
     * Проверка на нажатие клавиши "Вверх"
     * @return true - если нажато /false - если нет
     */
    boolean isUpPressed();

    /**
     * Проверка на нажатие клавиши "Вниз"
     * @return true - если нажато /false - если нет
     */
    boolean isDownPressed();

    /**
     * Проверка на нажатие клавиши "Влево"
     * @return true - если нажато /false - если нет
     */
    boolean isLeftPressed();

    /**
     * Проверка на нажатие клавиши "Вправо"
     * @return true - если нажато /false - если нет
     */
    boolean isRightPressed();

    /**
     * Проверка на нажатие клавиши "Огонь"
     * @return true - если нажато /false - если нет
     */
    boolean isFirePressed();

}