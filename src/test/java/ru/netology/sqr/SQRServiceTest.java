package ru.netology.sqr;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void bordersOfSquares() {
       SQRService service = new SQRService();

        // подготавливаем данные:

        int lowerLimit = 100;
        int upperLimit = 300;
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.rangeNum(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void bordersOfSquares200() {
        SQRService service = new SQRService();

        // подготавливаем данные:

        int lowerLimit = 100;
        int upperLimit = 200;
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.rangeNum(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}