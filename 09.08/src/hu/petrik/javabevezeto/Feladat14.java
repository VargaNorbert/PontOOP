package hu.petrik.javabevezeto;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérek egy szót:");

        String szo = sc.nextLine();
        String csinal= "";
        /*do {
            System.out.print("Mit szeretnél csinálni?");
            csinal = sc.nextLine();

            if (csinal == "a") {
                szo = szo.toUpperCase(Locale.ROOT);
                System.out.println(szo);
            } else if (csinal == "b") {
                szo = szo.toLowerCase(Locale.ROOT);
                System.out.println(szo);
            } else if (csinal == "c") {
                System.out.println(szo.length());
            } else if () {

            }

        } while (csinal != "f");*/

        while(!csinal.equals("f")){

            System.out.print("Mit szeretnél csinálni?");
            System.out.println("\ta - Nagy");
            System.out.println("\tb - Kicsi");
            System.out.println("\tc - Hossz");
            System.out.println("\td - Összehasonlít");
            System.out.println("\te - Kiiratás");
            System.out.println("\tf - Kilép");
            csinal = sc.nextLine();

        }

    }
}
