package com.company.transportType;

import com.company.Transport;

/**
 * Класс мотоцикл
 */
public class Motorcycle extends Transport {

    /**
     * Поле тип мотоцикла
     */
    private String motoType;

    /**
     * Конструктор класса мотоцикл
     */
    public Motorcycle() {
        this.name = "Мотоцикл";
        this.wheelsCount = 2;
        this.maxSpeed = 180;
        this.motoType = "Чоппер";
    }

    /**
     * Возвращает String-информацию о характеристиках мотоцикла
     */
    @Override
    public String provideInfo() {
        return String.format("%s%nТип мотоцикла: %s%n", super.provideInfo(), this.motoType);
    }

}
