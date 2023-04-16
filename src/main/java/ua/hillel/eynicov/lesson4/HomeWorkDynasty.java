package ua.hillel.eynicov.lesson4;

import org.w3c.dom.ls.LSOutput;

public class HomeWorkDynasty {
    public static void main(String[] args) {
        int numberOfWarriorsLi = 860;
        int warriorStrengthLi = 13;
        int archerStrengthLi = 24;
        int riderStrengthLi = 46;
        System.out.println("Залгальний показник атаки династіі Лі:");
        System.out.println( (numberOfWarriorsLi * warriorStrengthLi) + (numberOfWarriorsLi * archerStrengthLi) +
                (numberOfWarriorsLi * riderStrengthLi));

        double numberOfWarriorsMin = 860 * 1.5;
        int warriorStrengthMin = 9;
        int archerStrengthMin = 35;
        int riderStrengthMin = 12;
        System.out.println("Залгальний показник атаки династіі Мінь:");
        System.out.println(((int) numberOfWarriorsMin * warriorStrengthMin) + ((int)numberOfWarriorsMin * archerStrengthMin) +
        ((int)numberOfWarriorsMin * riderStrengthMin) );
    }
}

