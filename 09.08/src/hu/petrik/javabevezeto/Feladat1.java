package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Átmérő: ");
        double atmero = sc.nextDouble();

        System.out.print("Mélység: ");
        double melyseg = sc.nextDouble();

        double sugar = atmero / 2;
        double alapTerulet = sugar * sugar* Math.PI;
        double terfogat = alapTerulet * melyseg;

        System.out.printf("A medence térfogata %.3f köbméter", terfogat);


    }
}
