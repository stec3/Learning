import java.util.Scanner;
import java.util.Locale;

public class A08_esInputTastiera {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale (.) invece di quello italiano (,)
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // aggiungo contesto all'utente
        System.out.println("Calcoliamo la media matematica delle seguenti cifre.");

        // chiedo di inserire la prima cifra
        System.out.println("Inserisci la prima cifra: ");
        double cifra1 = scan.nextDouble();

        // chiedo di inserire la seconda cifra
        System.out.println("Inserisci la seconda cifra: ");
        double cifra2 = scan.nextDouble();

        // chiedo di inserire la terza cifra
        System.out.println("Inserisci la terza cifra: ");
        double cifra3 = scan.nextDouble();

        // calcolo la media delle tre cifre
        double media = (cifra1 + cifra2 + cifra3 / 3);
        System.out.println("La media dei numeri è: " + media);

        // chiudo lo scanner a fine progetto
        scan.close();
    }
}
