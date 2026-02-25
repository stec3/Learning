import java.util.Scanner;
import java.util.Locale;

public class e12_numeroPiuGrande {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // aiuto l'utente a capire il risultato
        System.out.println("Quale numero è il più grande?");

        // chiedo i due numeri da confrontare
        System.out.println("Inserire il primo numero: ");
        double numero1 = scan.nextDouble();

        System.out.println("Inserire il secondo numero: ");
        double numero2 = scan.nextDouble();

        // creo il confronto
        if ( numero1 > numero2) {
            System.out.println("Il primo numero ( " + numero1 + " ) è più grande");
        } else {
            System.out.println("Il secondo numero ( " + numero2 + " ) è più grande");
        }
        // chiudo lo scanner
        scan.close();
    }
}

// questo caso ESCLUDE che i due numeri siano uguali
// per considerare anche numeri uguali vedi -- e12_v2_numeroPiuGrande_completo --