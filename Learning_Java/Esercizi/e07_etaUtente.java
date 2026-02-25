import java.util.Scanner;
import java.util.Locale;

public class e07_etaUtente {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // inizio la richiesta
        System.out.println("Inserire l'età: ");
        int eta = scan.nextInt();

        // verifico se il numero è maggiore di 18
        if (eta >= 18) {
            System.out.println("È maggiorenne");
        } else {
            System.out.println("È minorenne");
        }
    }
}
