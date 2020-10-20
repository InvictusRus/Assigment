package com.company;
/**
 * Класс, выводящий переданный тип транспорта и его параметры
 * @author Иван Жеронкин
 */
public class Main {

    /**
     * Получаем на вход программные аргументы и выводим параметры транспорта, соответствующие аргументам
     */
    public static void main(String[] args) {
        args = new String[]{"0", "1", "2", "3", "5", "10", "1"};
        TransportFactory factory = new TransportFactory();
        for (String str : args) {
            Transport tr = factory.getTransport(str);
            if (tr == null) {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА" + "\n");
            } else {
                System.out.println(tr.provideInfo());
            }
        }
    }
}
