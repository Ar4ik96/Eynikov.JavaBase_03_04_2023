package ua.hillel.eynicov.lesson16;

public enum DrinksMachine {

    COFFEE(Drinks.COFFEE_PRICE, "Coffee"),
    TEA(Drinks.TEA_PRICE, "Tea"),
    LEMONADE(Drinks.LEMONADE_PRICE, "Lemonade"),
    MOJITO(Drinks.MOJITO_PRICE, "Mojito"),
    MINERAL_WATER(Drinks.MINERAL_WATER_PRICE,"Mineral Water"),
    COCA_COLA(Drinks.COCA_COLA_PRICE, "COCA-COLA");


    private double price;
    private String name;


    DrinksMachine(double price, String name) {
        this.price = price;
        this.name =name;
    }
public String getName(){
        return name;
}

    public void makeDrink() {
        switch (this) {
            case COFFEE:
                System.out.println("Coffee prepared. ");
                break;
            case TEA:
                System.out.println("Tea prepared. ");
                break;
            case LEMONADE:
                System.out.println("Lemonade prepared. ");
                break;
            case MOJITO:
                System.out.println("Mojito prepared. ");
                break;
            case MINERAL_WATER:
                System.out.println("Mineral water prepared. ");
                break;
            case COCA_COLA:
                System.out.println("COCA-COLA prepared. ");
                break;
            default:
                System.out.println("Incorrect beverage selection. " );
        }
    }
}




