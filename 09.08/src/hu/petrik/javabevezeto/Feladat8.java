package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipp(0- fej, 1- írás)");

        int tipp = sc.nextInt();


        int feldobas = (int) (Math.random() * 2);

        System.out.printf("A dobás eredménye %s \n", (feldobas == 0) ? "fej" : "írás");

        /*if (tipp == 0) {
            System.out.println("A feldobás eredménye: fej");

        } else {
            System.out.println("A feldobás eredménye: írás");
        }*/

        if (tipp == feldobas) {
            System.out.println("Gratulálok nyertél");
        } else {
            System.out.println("Sajnos vesztettél");
        }
    }
}
