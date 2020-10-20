package com.company.transportType;

import com.company.Transport;

/**
 * Класс автомобиль
 */
public class Car extends Transport {

    /**
     * Поле климат-контроль
     */
    private String climate;

    /**
     * Конструктор класса автомобиль
     */
    public Car() {
        this.name = "Автомобиль";
        this.wheelsCount = 4;
        this.maxSpeed = 220;
        this.climate = "Двухзонный";
    }

    /**
     * Возвращает String-информацию о характеристиках автомобиля
     */
    @Override
    public String provideInfo() {
        return String.format("%s%nКлимат контроль: %s%n", super.provideInfo(), this.climate);
    }

}
