package ua.hillel.eynicov.Lesson6;

public class HomeWorkShuttle {
    public static void main(String[] args) {
        System.out.println("Lucky shuttle numbers:");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
