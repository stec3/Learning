import java.util.Scanner;
import java.util.Locale;

public class e30_somma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserie un numero
        System.out.println("Inserire il numero.");

        // se il numero e 0, termino il programma
        double somma = 0;
        double numero = 0;

        System.out.println("Inserisci un numero (0 per terminare): ");
        numero = scan.nextDouble();

        while (numero != 0) {
            somma += numero;
            System.out.println("Inserisci un numero (0 per terminare): ");
            numero = scan.nextDouble();   }

        System.out.println("La somma è: " + somma);
    }
}
