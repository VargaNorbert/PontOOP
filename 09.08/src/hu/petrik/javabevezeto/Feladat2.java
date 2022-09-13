package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Magasság: ");
        double magassag = sc.nextDouble();
        System.out.print("Szélesség: ");
        double szelesseg = sc.nextDouble();

        double csempeMeret = 0.2 * 0.2;

        double alap = magassag * szelesseg;

        double darabCsempe = alap * 0.9 / csempeMeret;

        System.out.printf("%.0f darab csempére lesz szükség", darabCsempe);
    }
}
