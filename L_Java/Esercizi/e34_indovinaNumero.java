import java.util.Scanner;
import java.util.Locale;

public class e34_indovinaNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // genero un numero casuale tra 1 e 100
        int numeroCasuale = (int)(Math.random() * 100) + 1;

        int tentativo = 0;
        int contatore = 0;

        // chiedo all'utente di indovinare finché non ci riesce
        while (tentativo != numeroCasuale) {
            System.out.println("Indovina il numero (tra 1 e 100): ");
            tentativo = scan.nextInt();
            contatore++;

            if (tentativo > numeroCasuale) {
                System.out.println("Troppo alto!");
            } else if (tentativo < numeroCasuale) {
                System.out.println("Troppo basso!");
            }
        }

        System.out.println("Bravo! Hai indovinato in " + contatore + " tentativi!");

        scan.close();
    }
}
