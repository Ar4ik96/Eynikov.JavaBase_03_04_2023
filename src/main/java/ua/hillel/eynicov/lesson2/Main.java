package ua.hillel.eynicov.lesson2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal latitude = new BigDecimal("27.988056");
        BigDecimal longitude = new BigDecimal("86.925278");
        char degreeSymbol = '\u00B0';
        System.out.println("Широта и Долгота горы Эверест");
        System.out.print(latitude);
        System.out.print(degreeSymbol);
        System.out.println();
        System.out.print(longitude);
        System.out.print(degreeSymbol);
    }
}