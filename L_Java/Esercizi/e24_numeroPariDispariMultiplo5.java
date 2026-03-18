import java.util.Scanner;
import java.util.Locale;

public class e24_numeroPariDispariMultiplo5 {
    public static void main(String[] args) {
        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire un numero
        System.out.println("Inserisci un numero: ");
        double numero = scan.nextDouble();

        // verifico se il numero è pari o dispari, e se è multiplo di 5 (if annidati)
        if (numero % 2 == 0) {
            System.out.println("Il numero è pari.");
            if (numero % 5 == 0) {
                System.out.println("Il numero è anche multiplo di 5.");
            } else {
                System.out.println("Il numero non è multiplo di 5.");
            }
        } else {
            System.out.println("Il numero è dispari.");
            if (numero % 5 == 0) {
                System.out.println("Il numero è anche multiplo di 5.");
            } else {
                System.out.println("Il numero non è multiplo di 5.");
            }
        }

        // chiudo lo scanner
        scan.close();
    }
}
