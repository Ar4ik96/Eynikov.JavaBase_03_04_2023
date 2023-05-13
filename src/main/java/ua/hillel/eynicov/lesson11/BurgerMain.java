package ua.hillel.eynicov.lesson11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("bun", "onePortionMeat","cheese", "greens", "mayo");
        Burger dietBurger = new Burger("bun", "onePortionMeat","cheese", "greens");
        Burger doubleMeatRegularBurger = new Burger("bun", "onePortionMeat", "twoServingMeat","cheese", "greens", "mayo");
    }
}
