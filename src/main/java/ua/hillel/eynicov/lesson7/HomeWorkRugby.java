package ua.hillel.eynicov.lesson7;

public class HomeWorkRugby {
    public static void main(String[] args) {
        int minAge = 18;
        int maxAge = 40;
        int[] command1 = new int[25];
        int[] command2 = new int[25];
        for (int i = 0; i < 25; i++) {
            command1[i] = minAge + (int) (Math.random() * ((maxAge - minAge) + 1));
            command2[i] = minAge + (int) (Math.random() * ((maxAge - minAge) + 1));
        }
        System.out.print("Team 1: ");
        for (int i = 0; i < command1.length; i++) {
            if (i == command1.length-1) {
                System.out.print(command1[i]);
            } else {
                System.out.print(command1[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Team 2: ");
        for (int i = 0; i < command2.length; i++) {
            if (i == command2.length-1) {
                System.out.print(command2[i]);
            } else {
                System.out.print(command2[i] + ", ");
            }
        }
        System.out.println();

        double avgAgeCommand1 = 0;
        double avgAgeCommand2 = 0;
        for (int i = 0; i < 25; i++) {
            avgAgeCommand1 += command1[i];
            avgAgeCommand2 += command2[i];
        }
        avgAgeCommand1 /= 25;
        avgAgeCommand2 /= 25;
        System.out.println("Average age of team players 1: " + avgAgeCommand1);
        System.out.println("Average age of team players 2: " + avgAgeCommand2);
    }
}

