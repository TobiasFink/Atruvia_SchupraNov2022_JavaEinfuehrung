package de.atruvia.schupranov2022;

import java.util.Scanner;

/*
 * Übung 6: Methoden
 *
 * Den bisherigen Code haben wir ausschließlich in die main()-Methode geschrieben.
 * Um unser Programm etwas übersichtlicher zu gestalten, empfiehlt es sich,
 * die einzelnen Teile in Methoden auszulagern.
 *
 * Extrahiere den existierenden Code der main()-Methode in neue "static void"-Methoden:
 *  - leseWerteEin()
 *  - gebeVariablenAus()
 *  - fuehreBerechnungDurch()
 *  - gebeEntwicklungAus()
 *
 * Rufe nun diese Methoden nacheinander in der main()-Methode auf.
 */
public class Uebung6
{
    /* --- Deklaration und Initialisierung der benötigten Variablen --- */
    static double monatlicheEinzahlung = 200;       // Höhe der monatlichen Einzahlungen in Euro
    static double zinssatz = 4.5;                   // Zinssatz in Prozent
    static int laufzeit = 72;                       // Laufzeit in Monaten

    static double kontostand = 0.0;                 // Aktueller Kontostand in Euro
    static double[] kontostandEntwicklung;          // double-Array, in welchem die Entwicklung gespeichert wird

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

        System.out.println("Laufzeit in Monaten: ");
        laufzeit = scanner.nextInt();

        System.out.println();

        kontostandEntwicklung = new double[laufzeit];
    }

    static void gebeVariablenAus()
    {
        /* --- Ausgabe der Variablen --- */
        System.out.println("--- Berechnungsgrundlage ---");
        System.out.println("Höhe der monatlichen Einzahlungen: " + monatlicheEinzahlung + " EUR");
        System.out.println("Zinssatz: " + zinssatz + " %");
        System.out.println("Laufzeit: " + laufzeit + " Monate");

        /* --- Überprüfen, ob die Laufzeit größer null ist --- */
        if (laufzeit == 0)
        {
            System.out.println("Die Laufzeit darf nicht null sein!");
        }

        System.out.println();
    }

    static void fuehreBerechnungDurch()
    {
        /* --- Durchführung der Berechnung und Speichern des jeweiligen Kontostands --- */
        for (int aktuellerMonat = 1; aktuellerMonat <= laufzeit; aktuellerMonat++)
        {
            kontostand = kontostand + monatlicheEinzahlung;

            if (aktuellerMonat % 12 == 0)
            {
                double zinsen = kontostand * zinssatz / 100;
                kontostand = kontostand + zinsen;
            }

            kontostandEntwicklung[aktuellerMonat - 1] = kontostand;
        }
    }

    static void gebeEntwicklungAus()
    {
        /* --- Ausgabe des jeweiligen Kontostands durch Iterieren über das Array --- */
        for (int i = 0; i < kontostandEntwicklung.length; i++)
        {
            System.out.println("Monat: " + (i + 1) + " | Aktueller Kontostand: " + kontostandEntwicklung[i] + " EUR");
        }
    }
}
