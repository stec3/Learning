import java.util.Scanner;
import java.util.Locale;

public class e22_pariPositivoMinore100 {
    public static void main(String[] args) {
        // Creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // Chiedo all'utente di inserire un numero
        System.out.println("Inserisci un numero: ");  // ← mancava il ;
        double numero = scan.nextDouble();

        // Verifico se il numero è positivo, pari e minore di 100
        if (numero > 0) {
            if (numero % 2 == 0) {
                if (numero < 100) {  // ← era <= 100, "minore di 100" significa <
                    System.out.println("Il numero è positivo, pari e minore di 100");
                } else {
                    System.out.println("Il numero è positivo e pari, ma maggiore o uguale a 100");
                }
            } else {
                if (numero < 100) {
                    System.out.println("Il numero è positivo e minore di 100, ma non è pari");
                } else {
                    System.out.println("Il numero è positivo, ma non è pari e non è minore di 100");
                }
            }
        } else {
            if (numero % 2 == 0) {
                if (numero < 100) {
                    System.out.println("Il numero è pari e minore di 100, ma non è positivo");
                } else {
                    System.out.println("Il numero è pari, ma non è positivo e non è minore di 100");
                }
            } else {
                if (numero < 100) {
                    System.out.println("Il numero è minore di 100, ma non è positivo e non è pari");
                } else {
                    System.out.println("Il numero non è positivo, non è pari e non è minore di 100");
                }
            }
        }
        // Chiudo lo scanner
        scan.close();
    }
}
