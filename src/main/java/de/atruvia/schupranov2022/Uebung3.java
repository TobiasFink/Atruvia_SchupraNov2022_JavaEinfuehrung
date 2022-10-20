package de.atruvia.schupranov2022;

/*
 * Übung 3: Schleifen
 *
 * Jetzt implementieren wir die eigentliche Berechnung des Kontostands.
 *
 * Erstelle hierfür eine for-Schleife, welche über die Laufzeit iteriert.
 *
 * Innerhalb dieser Schleife addierst du die monatliche Einzahlung zum aktuellen Kontostand hinzu.
 *
 * Nach Ablauf eines Jahres, d.h. bei jedem zwölften Monat, werden die Zinsen mittels der Formel
 *  zinsen = kontostand * zinssatz / 100
 * berechnet und zum aktuellen Kontostand addiert.
 *
 * Gebe nun (ebenfalls innerhalb der Schleife) den aktuellen Monat sowie den dazugehörigen Kontostand auf der Konsole aus.
 */
public class Uebung3
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
