package ua.hillel.eynicov.Lesson5;

import java.util.Scanner;

public class HomeWorkCS {
    public static void main(String[] args) {
        Scanner firstTeam = new Scanner(System.in);
        System.out.println("Enter name first team");
        String nameFirstTeam = firstTeam.nextLine();
        System.out.println("Enter the name of the first team = " + nameFirstTeam);

        System.out.println("Enter the number of frags for the 5 players of the first team");
        Scanner frags = new Scanner(System.in);
        int firstPlayer = 0;
        if (frags.hasNextInt()) {
            firstPlayer = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("First player = " + firstPlayer);

        frags.hasNextInt();
        int secondPlayer = 0;
        if (frags.hasNextInt()) {
            secondPlayer = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Second Player = " + secondPlayer);

        frags.hasNextInt();
        int thirdPlayer = 0;
        if (frags.hasNextInt()) {
            thirdPlayer = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("The third Player = " + thirdPlayer);

        frags.hasNextInt();
        int fourthPlayer = 0;
        if (frags.hasNextInt()) {
            fourthPlayer = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("The fourth player = " + fourthPlayer);

        frags.hasNextInt();
        int fifthPlayer = 0;
        if (frags.hasNextInt()) {
            fifthPlayer = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Fifth Player = " + fifthPlayer);

        double fragsFirstTeam = (double) (firstPlayer+secondPlayer+thirdPlayer+fourthPlayer+fifthPlayer) / 5;

        Scanner secondTeam = new Scanner(System.in);
        System.out.println("Enter name second team");
        String nameSecondTeam = secondTeam.nextLine();
        System.out.println("Enter the name of the second team = " + nameSecondTeam);

        System.out.println("Enter the number of frags for the 5 players of the first team");
        int firstPlayerSecondTeam = 0;
        if (frags.hasNextInt()) {
            firstPlayerSecondTeam = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("The first player of the second team = " + firstPlayerSecondTeam);

        frags.hasNextInt();
        int secondPlayerSecondTeam = 0;
        if (frags.hasNextInt()) {
            secondPlayerSecondTeam = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("The second player of the second team = " + secondPlayerSecondTeam);

        frags.hasNextInt();
        int thirdPlayerSecondTeam = 0;
        if (frags.hasNextInt()) {
            thirdPlayerSecondTeam = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("The third player of the second team = " + thirdPlayerSecondTeam);

        frags.hasNextInt();
        int fourthPlayerSecondTeam= 0;
        if (frags.hasNextInt()) {
            fourthPlayerSecondTeam = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("The fourth player of the second team = " + fourthPlayerSecondTeam);

        frags.hasNextInt();
        int fifthPlayerSecondTaem = 0;
        if (frags.hasNextInt()) {
            fifthPlayerSecondTaem = frags.nextInt();
            frags.nextLine();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Fifth Player of the second team = " + fifthPlayerSecondTaem);
        double fragsSecondTeam = (double) (firstPlayerSecondTeam+secondPlayerSecondTeam+thirdPlayerSecondTeam+fourthPlayerSecondTeam +
                fifthPlayerSecondTaem)/5;

        if (fragsFirstTeam>fragsSecondTeam){
            System.out.println("The winning team " + nameFirstTeam + " scored " + fragsFirstTeam + " points" );
        } else if (fragsFirstTeam<fragsSecondTeam) {
            System.out.println("The winning team " + nameSecondTeam + " scored " + fragsSecondTeam + " points");
        } else if (fragsFirstTeam==fragsSecondTeam) {
            System.out.println("The game ended in a tie, friendship won.");
        }

    }
}
