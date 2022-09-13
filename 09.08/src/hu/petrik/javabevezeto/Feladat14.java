package hu.petrik.javabevezeto;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérek egy szót:");

        String szo = sc.nextLine();
        String csinal;
        do {
            System.out.print("Mit szeretnél csinálni?");
            csinal = sc.nextLine();

            if (csinal == "a") {
                szo = szo.toUpperCase(Locale.ROOT);
                System.out.println(szo);
            }
            if (csinal == "b") {
                szo = szo.toLowerCase(Locale.ROOT);
                System.out.println(szo);
            }
            if (csinal == "c"){
                System.out.println(szo.length());
            }

        } while (csinal != "e");

    }
}
