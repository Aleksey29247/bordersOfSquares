package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int lowerLimit = 100;
        int upperLimit = 300;
        SQRService sgrService = new SQRService();
        int a = sgrService.rangeNum(lowerLimit, upperLimit);
        System.out.printf("Цикл завершен %d", a);
    }
}
