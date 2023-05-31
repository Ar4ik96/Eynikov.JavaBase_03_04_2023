package ua.hillel.eynicov.lesson16;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Choose a beverage: ");
            System.out.println("1 Coffee");
            System.out.println("2 Tea");
            System.out.println("3 Lemonade");
            System.out.println("4 Mojito");
            System.out.println("5 Mineral Water");
            System.out.println("6 COCA-COLA");
            System.out.println("0. Complete the order");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        DrinksMachine.COFFEE.makeDrink();
                        Drinks.addDrink(Drinks.COFFEE_PRICE);
                        break;
                    case 2:
                        DrinksMachine.TEA.makeDrink();
                        Drinks.addDrink(Drinks.TEA_PRICE);
                        break;
                    case 3:
                        DrinksMachine.LEMONADE.makeDrink();
                        Drinks.addDrink(Drinks.LEMONADE_PRICE);
                        break;
                    case 4:
                        DrinksMachine.MOJITO.makeDrink();
                        Drinks.addDrink(Drinks.MOJITO_PRICE);
                        break;
                    case 5:
                        DrinksMachine.MINERAL_WATER.makeDrink();
                        Drinks.addDrink(Drinks.MINERAL_WATER_PRICE);
                        break;
                    case 6:
                        DrinksMachine.COCA_COLA.makeDrink();
                        Drinks.addDrink(Drinks.COCA_COLA_PRICE);
                        break;
                    case 0:
                        System.out.println("Order completed. ");
                        System.out.println("Quantity of beverages: " + Drinks.getTotalDrinks());
                        System.out.println("Total amount: " + Drinks.getTotalPrice());
                        return;
                    default:
                        System.out.println("Incorrect selection. ");
                }

            }catch (InputMismatchException e) {
                System.out.println("Error: Please enter a whole number. ");
            }
            scanner.nextLine();
        }

    }
}
