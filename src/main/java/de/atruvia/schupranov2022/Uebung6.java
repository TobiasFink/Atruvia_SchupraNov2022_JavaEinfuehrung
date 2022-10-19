package de.atruvia.schupranov2022;

import java.util.Scanner;

public class Uebung6
{
    /* --- Deklaration und Initialisierung der benötigten Variablen --- */
    static double monatlicheEinzahlung = 200;      // Höhe der monatlichen Einzahlungen in Euro
    static double zinssatz = 4.5;                  // Zinssatz in Prozent
    static int laufzeit = 72;                      // Mindestlaufzeit/Dauer der Sparphase in Monaten

    static double bausparguthaben = 0.0;           // Aktuelles Bausparguthaben (angespartes Vermögen) in Euro
    static double[] bausparguthabenEntwicklung = new double[laufzeit];  // double-Array, in welchem die Entwicklung gespeichert wird

    public static void main(String[] args)
    {
        leseWerteEin();

        gebeVariablenAus();

        fuehreBerechnungDurch();

        gebeEntwicklungAus();
    }

    static void leseWerteEin()
    {
        /* --- Einlesen der Werte über die Konsole --- */
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Eingabe der Werte ---");

        System.out.println("Höhe der monatlichen Einzahlungen: ");
        monatlicheEinzahlung = scanner.nextDouble();

        System.out.println("Zinssatz in Prozent: ");
        zinssatz = scanner.nextDouble();

        System.out.println("Mindestlaufzeit/Dauer der Sparphase in Monaten: ");
        laufzeit = scanner.nextInt();

        System.out.println();
    }

    static void gebeVariablenAus()
    {
        /* --- Ausgabe der Variablen --- */
        System.out.println("--- Berechnungsgrundlage ---");
        System.out.println("Höhe der monatlichen Einzahlungen: " + monatlicheEinzahlung + " EUR");
        System.out.println("Zinssatz: " + zinssatz + " %");
        System.out.println("Mindestlaufzeit/Dauer der Sparphase: " + laufzeit + " Monate");

        /* --- Überprüfen, ob die Mindestlaufzeit größer null ist --- */
        if (laufzeit == 0)
        {
            System.out.println("Die Mindestlaufzeit/Dauer der Sparphase darf nicht null sein!");
        }

        System.out.println();
    }

    static void fuehreBerechnungDurch()
    {
        /* --- Durchführung der Berechnung und Ausgabe des monatlichen Bausparguthabens --- */
        for (int aktuellerMonat = 1; aktuellerMonat <= laufzeit; aktuellerMonat++)
        {
            bausparguthaben = bausparguthaben + monatlicheEinzahlung;

            if (aktuellerMonat % 12 == 0)
            {
                double zinsen = bausparguthaben * zinssatz / 100;
                bausparguthaben = bausparguthaben + zinsen;
            }

            bausparguthabenEntwicklung[aktuellerMonat - 1] = bausparguthaben;
        }
    }

    static void gebeEntwicklungAus()
    {
        /* --- Ausgabe des monatlichen Bausparguthabens durch Iterieren über das Array --- */
        for (int i = 0; i < bausparguthabenEntwicklung.length; i++)
        {
            System.out.println("Monat: " + (i + 1) + " | Aktuelles Bausparguthaben: " + bausparguthabenEntwicklung[i]);
        }
    }
}
