package de.atruvia.schupranov2022;

public class Uebung2
{
    public static void main(String[] args)
    {
        /* --- Deklaration und Initialisierung der benötigten Variablen --- */
        double monatlicheEinzahlung = 200;      // Höhe der monatlichen Einzahlungen in Euro
        double zinssatz = 4.5;                  // Zinssatz in Prozent
        int laufzeit = 72;                      // Mindestlaufzeit/Dauer der Sparphase in Monaten

        double bausparguthaben = 0.0;           // Aktuelles Bausparguthaben (angespartes Vermögen) in Euro

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

        // TODO: weitere/andere if-Abfragen?
    }
}
