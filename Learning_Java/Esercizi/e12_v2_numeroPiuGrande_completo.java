import java.util.Scanner;
import java.util.Locale;

public class e12_v2_numeroPiuGrande_completo {
    public static void main(String [] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // aiuto l'utente a capire il risultato
        System.out.println("Quale dei due numeri è più grande?");

        // chiedo i due numeri
        System.out.println("Inserire il primo numero: ");
        double numero1 = scan.nextDouble();

        System.out.println("Inserire il secondo numero: ");
        double numero2 = scan.nextDouble();

        // inizio il confronto
        if (numero1 > numero2) {
            System.out.println("Il primo numero ( " + numero1 + " ) è più grande.");
        } else if (numero1 < numero2) {
            System.out.println("Il secondo numero ( " + numero2 + " ) è più grande.");
        } else {
            System.out.println("I due numeri ( " + numero1  + ", " + numero2 + " ) sono uguali.");
        }
        // chiudo lo scanner
        scan.close();
    }
}

// versione migliorata (che considera anche il caso in cui i due numeri siano uguali) della classe
// e12_numeroPiuGrande