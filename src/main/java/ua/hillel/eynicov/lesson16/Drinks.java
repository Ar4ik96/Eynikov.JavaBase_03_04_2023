package ua.hillel.eynicov.lesson16;

public class Drinks {
    public static final double COFFEE_PRICE = 2.5;
    public static final double TEA_PRICE = 1.5;
    public static final double LEMONADE_PRICE = 2.0;
    public static final double MOJITO_PRICE = 3.0;
    public static final double MINERAL_WATER_PRICE = 1.0;
    public static final double COCA_COLA_PRICE = 1.5;


    private static int totalDrinks = 0;
    private static double totalPrice = 0.0;

    public static int getTotalDrinks() {
        return totalDrinks;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void addDrink(double price) {
        totalDrinks++;
        totalPrice += price;

    }

}
