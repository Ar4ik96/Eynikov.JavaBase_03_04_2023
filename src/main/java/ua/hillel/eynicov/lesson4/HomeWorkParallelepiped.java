package ua.hillel.eynicov.lesson4;

public class HomeWorkParallelepiped {
    public static void main(String[] args) {
        int lengthParallelepiped = 5;
        int widthParallelepiped = 3;
        int heightParallelepiped = 2;
        int volume = lengthParallelepiped*widthParallelepiped*heightParallelepiped;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        int lenght = 4*(lengthParallelepiped+widthParallelepiped+heightParallelepiped);
        System.out.println("Сумарна довжина всіх сторін = " + lenght );
    }
}
