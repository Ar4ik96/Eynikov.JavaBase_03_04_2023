package ua.hillel.eynicov.lesson8;

import java.util.Arrays;
import java.util.Random;
public class HomeWorkLottery {
        public static void main(String[] args) {
                int[] lotteryNumbers = new int[7];
                int[] playerNumbers = new int[7];

                Random random = new Random();

                for (int i = 0; i < 7; i++) {
                    lotteryNumbers[i] = random.nextInt(10);
                    playerNumbers[i] = random.nextInt(10);
                }
                Arrays.sort(lotteryNumbers);
                Arrays.sort(playerNumbers);

                System.out.println("Lottery numbers: " + Arrays.toString(lotteryNumbers));
                System.out.println("Player numbers: " + Arrays.toString(playerNumbers));

                int matches = 0;
                StringBuilder matchingIndexes = new StringBuilder("Matching indexes: ");
                for (int i = 0; i < 7; i++) {
                    if (lotteryNumbers[i] == playerNumbers[i]) {
                        matches++;
                        matchingIndexes.append(i).append(" ");
                    }
                }

                System.out.println("Number of matches: " + matches);
                System.out.println(matchingIndexes.toString());
            }
        }


