package de.atruvia.schupranov2022;

/*
 * Übung 2: Kontrollstrukturen
 *
 * Nun soll eine Fehlermeldung ausgegeben werden,
 * wenn die angegebene Laufzeit des Sparkontos Null und somit ungültig ist.
 *
 * Nutze hierfür eine if-Abfrage, welche überprüft, ob der Wert der Variable "laufzeit" Null ist.
 */
public class Uebung2
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

        /* --- Überprüfen, ob die Laufzeit größer null ist --- */
        if (laufzeit == 0)
        {
            System.out.println("Die Laufzeit darf nicht null sein!");
        }
    }
}
