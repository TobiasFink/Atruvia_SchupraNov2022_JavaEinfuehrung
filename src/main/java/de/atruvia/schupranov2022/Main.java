package de.atruvia.schupranov2022;

public class Main
{
    public static void main(String[] args)
    {
        double einzahlung = 200;
        double zinssatz = 4.5;
        double ersparnisse = 0.0;
        int monate = 72;

        for (int i = 1; i <= monate; i++)
        {
            if (i % 12 != 0)
            {
                ersparnisse = ersparnisse + einzahlung;
            }
            else
            {
                double jahresvermoegen = ersparnisse + einzahlung;

                ersparnisse = jahresvermoegen + jahresvermoegen * zinssatz / 100;
            }

            String ausgabe = "Monat: " + i + "   Angespartes Vermögen: " + ersparnisse;

            if (i % 12 == 0)
            {
                ausgabe = ausgabe + "\n";
            }

            System.out.println(ausgabe);
        }
    }
}
