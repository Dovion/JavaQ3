package com.company;

public class Main {

    public static void main(String[] args) {
        var ticketPrice = 20000;
        var bonusPerPrice = 20;

        var result = ticketPrice / bonusPerPrice;
        System.out.println("Начислено бонусов: " + result);
    }
}
