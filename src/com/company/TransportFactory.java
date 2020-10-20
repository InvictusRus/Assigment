package com.company;

import com.company.transportType.Bus;
import com.company.transportType.Car;
import com.company.transportType.Motorcycle;
import com.company.transportType.Scooter;

/**
 * Класс, в котором создаются необходимые обьекты
 */
public class TransportFactory {

    /**
     * Создаем и возвращаем обьект нужного типа
     */
    public Transport getTransport(String type) {
        Transport result = null;
        switch (type) {
            case "0":
                result = new Motorcycle();
                break;
            case "1":
                result = new Scooter();
                break;
            case "2":
                result = new Car();
                break;
            case "3":
                result = new Bus();
                break;
        }
        return result;
    }

}
