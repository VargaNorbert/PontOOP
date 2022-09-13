package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a oldal: ");
        double a = sc.nextDouble();
        System.out.print("b oldal: ");
        double b = sc.nextDouble();
        System.out.print("c oldal: ");
        double c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double k = a + b + c;
            System.out.println("A háromszög kerülete: " + k);
        } else {
            System.out.println("Hibás adatok");
        }


    }
}
