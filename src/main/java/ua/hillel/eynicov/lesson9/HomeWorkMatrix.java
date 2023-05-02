package ua.hillel.eynicov.lesson9;

import java.util.Scanner;

public class HomeWorkMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = 0;
        int N = 0;
        while (true) {
            System.out.println("Enter the number of rows (M): ");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please enter a valid integer.");
                scanner.next();
            }
        }
        while (true) {
            System.out.println("Enter the number of columns (N): ");
            if (scanner.hasNextInt()){
                N = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please enter a valid integer.");
                scanner.next();
            }
        }
        int[][] array1 = new int[M][N];
        int[][] array2 = new int[N][M];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("BEFORE");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }


        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1[i].length; j++) {
                int temp = array1[i][j];
                array1[i][j] = array1[j][i];
                array1[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("AFTER");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }


    }
}