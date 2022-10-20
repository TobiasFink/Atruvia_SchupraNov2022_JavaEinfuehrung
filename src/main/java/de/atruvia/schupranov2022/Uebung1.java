package de.atruvia.schupranov2022;

/*
 * Übung 1: Erstellen des ersten Programms
 *
 * Es soll ein Rechner zur Berechnung des Kontostandverlaufs eines Sparkontos mit Zinsen erstellt werden.
 * Nach Eingabe der Höhe der monatlichen Einzahlungen, des Zinssatzes sowie der Laufzeit
 * wird der Kontostand am Ende der jeweiligen Monate ausgegeben.
 *
 * Erstelle hierfür zunächst die benötigten Variablen mit beliebigen Werten:
 *  - monatlicheEinzahlung (Kommazahl)
 *  - zinssatz (Kommazahl)
 *  - laufzeit (Ganzzahl)
 *  - kontostand (Kommazahl)
 *
 * Gebe anschließend die Werte der Variablen mithilfe der Methode System.out.println() auf der Konsole aus.
 */
public class Uebung1
{
    public static void main(String[] args)
    {
        /* --- Deklaration und Initialisierung der benötigten Variablen --- */
        double monatlicheEinzahlung = 200;      // Höhe der monatlichen Einzahlungen in Euro
        double zinssatz = 4.5;                  // Zinssatz in Prozent
        int laufzeit = 72;                      // Laufzeit in Monaten

        double kontostand = 0.0;                // Aktueller Kontostand in Euro

        /* --- Ausgabe der Variablen --- */
        System.out.println("--- Berechnungsgrundlage ---");
        System.out.println("Höhe der monatlichen Einzahlungen: " + monatlicheEinzahlung + " EUR");
        System.out.println("Zinssatz: " + zinssatz + " %");
        System.out.println("Laufzeit: " + laufzeit + " Monate");
    }
}
