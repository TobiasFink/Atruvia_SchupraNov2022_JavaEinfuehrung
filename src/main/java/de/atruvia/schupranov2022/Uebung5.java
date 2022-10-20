package de.atruvia.schupranov2022;

import java.util.Scanner;

/*
 * Übung 5: Arrays
 *
 * Bisher haben wir den Kontostand direkt nach der Berechnung ausgeben.
 * Nun soll der gesamte Kontostandverlauf zunächst berechnet und gespeichert,
 * und erst am Ende ausgegeben werden.
 *
 * Erstelle hierfür ein Array "kontostandEntwicklung" vom Typ "double" und mit der Länge der Laufzeit,
 * in welchem die Kontostände der einzelnen Monate gespeichert werden.
 *
 * Anstelle der Konsolenausgabe in der for-Schleife speichern wir jetzt den Kontostand
 * an der Position des aktuellen Monats im Array "kontostandEntwicklung".
 *
 * Am Ende unseres Programms iterieren wir mit einer weiteren for-Schleife über das Array
 * und geben jeden Monat sowie den jeweils gespeicherten Kontostand aus.
 */
public class Uebung5
{
    public static void main(String[] args)
    {
        /* --- Deklaration und Initialisierung der benötigten Variablen --- */
        double monatlicheEinzahlung = 200;      // Höhe der monatlichen Einzahlungen in Euro
        double zinssatz = 4.5;                  // Zinssatz in Prozent
        int laufzeit = 72;                      // Laufzeit in Monaten

        double kontostand = 0.0;                // Aktueller Kontostand in Euro
        double[] kontostandEntwicklung;         // double-Array, in welchem die Entwicklung gespeichert wird

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

        /* --- Ausgabe des jeweiligen Kontostands durch Iterieren über das Array --- */
        for (int i = 0; i < kontostandEntwicklung.length; i++)
        {
            System.out.println("Monat: " + (i + 1) + " | Aktueller Kontostand: " + kontostandEntwicklung[i] + " EUR");
        }
    }
}
