package com.company;
/**
 * Класс родитель всех транспортных средств
 */
public abstract class Transport implements Information {

    /** Поле наименование */
    public String name;
    /** Поле количество колёс */
    public int wheelsCount;
    /** Поле максимальная скорость */
    public int maxSpeed;

    /**
     * Возвращает String-информацию о характеристиках транспорта
     */
    @Override
    public String provideInfo() {
        return String.format("%s%nКоличество колес: %s%nМаксимальная скорость: %s",
                this.name,
                this.wheelsCount,
                this.maxSpeed);
    }

}
