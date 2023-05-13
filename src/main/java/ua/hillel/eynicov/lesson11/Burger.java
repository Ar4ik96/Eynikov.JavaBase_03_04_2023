package ua.hillel.eynicov.lesson11;

public class Burger {
    private String bun;
    private String onePortionMeat;
    private String twoServingMeat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger(String bun, String onePortionMeat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Звичайний бургер склад: "+ bun + " " + onePortionMeat + " " + cheese + " " + greens + " " + mayo);
    }

    public Burger(String bun, String onePortionMeat, String cheese, String greens) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Діетичний бургер склад: "+ bun + " " + onePortionMeat + " " + cheese + " " + greens );
    }

    public Burger(String bun, String onePortionMeat, String twoServingMeat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.twoServingMeat = twoServingMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Бургер з подвійним мясом склад: " + bun + " " + onePortionMeat + " " + twoServingMeat + " " + cheese + " " + greens + " " + mayo);
    }
}
