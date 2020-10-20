package com.company;

/**
 * Класс автобус
 */
public class Bus extends Transport {

    /** Поле вместимость */
    private int capacity;

    /**
     * Конструктор класса автобус
     */
    public Bus() {
        this.name = "Автобус";
        this.wheelsCount = 6;
        this.maxSpeed = 120;
        this.capacity = 49;
    }

    /**
     * Возвращает String-информацию о характеристиках автобуса
     */
    @Override
    public String provideInfo() {
        return String.format("%s%nВместимость: %s%n", super.provideInfo(), this.capacity);
    }

}
