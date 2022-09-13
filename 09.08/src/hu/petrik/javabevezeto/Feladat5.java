package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a oldal: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("b oldal: ");
        double b = sc.nextDouble();
        sc.nextLine();

        System.out.print("Mit szeretne megtudni? (K: kerület, T: terület)");
        String muvelet = sc.next();

        if (muvelet.equals("K")) {
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete %.2f cm \n", kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            System.out.printf("A téglalap területe %.2f négyzetcentiméter \n", terulet);
        } else {
            System.out.println("Hiba");
        }

        if (a == b) {
            System.out.println("Az alakzat egy négyzet!");
        }
    }
}
