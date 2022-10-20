package de.atruvia.schupranov2022;

import java.util.Scanner;

/*
 * Übung 4: Scanner
 *
 * Bisher haben wir die Werte der Variablen direkt beim Erstellen festgelegt
 * und sie waren nicht durch den Benutzer veränderbar.
 *
 * Lese nun die Werte für die monatliche Einzahlung, den Zinssatz sowie die Laufzeit mithilfe eines Scanners
 * über die Konsole ein und speichere diese in den bereits vorhandenen Variablen.
 * Gebe am besten vor jedem Aufruf des Scanners/Einlesen einer Variable über System.out.println() aus,
 * welcher Wert eingegeben werden soll.
 */
public class Uebung4
{
    public static void main(String[] args)
    {
        /* --- Deklaration und Initialisierung der benötigten Variablen --- */
        double monatlicheEinzahlung = 200;      // Höhe der monatlichen Einzahlungen in Euro
        double zinssatz = 4.5;                  // Zinssatz in Prozent
        int laufzeit = 72;                      // Laufzeit in Monaten

        double kontostand = 0.0;                // Aktueller Kontostand in Euro

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

        /* --- Durchführung der Berechnung und Ausgabe des jeweiligen Kontostands --- */
        for (int aktuellerMonat = 1; aktuellerMonat <= laufzeit; aktuellerMonat++)
        {
            kontostand = kontostand + monatlicheEinzahlung;

            if (aktuellerMonat % 12 == 0)
            {
                double zinsen = kontostand * zinssatz / 100;
                kontostand = kontostand + zinsen;
            }

            System.out.println("Monat: " + aktuellerMonat + " | Aktueller Kontostand: " + kontostand + " EUR");
        }
    }
}
