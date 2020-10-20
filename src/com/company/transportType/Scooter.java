package com.company.transportType;

import com.company.Transport;

/**
 * Класс самокат
 */
public class Scooter extends Transport {

    /**
     * Поле цвет
     */
    private String color;

    /**
     * Конструктор класса самокат
     */
    public Scooter() {
        this.name = "Самокат";
        this.wheelsCount = 2;
        this.maxSpeed = 20;
        this.color = "Красно-черный";
    }

    /**
     * Возвращает String-информацию о характеристиках самоката
     */
    @Override
    public String provideInfo() {
        return String.format("%s%nЦвет: %s%n", super.provideInfo(), this.color);
    }

}
