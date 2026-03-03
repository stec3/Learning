import java.util.Scanner;
import java.util.Locale;

public class e21_maxQuattroNumeri {
    public static void main(String[] args) {

        // creo lo scanner e imposto ils eparatore decimale universale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente quattro numeri interi
        System.out.println("Inserire quattro numeri interi." +
                "Primo numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Secondo numero: ");
        int numero2 = scan.nextInt();
        System.out.println("Terzo numero: ");
        int numero3 = scan.nextInt();
        System.out.println("Quarto numero: ");
        int numero4 = scan.nextInt();

        // inizio il confronto
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero1 > numero4) {
                    System.out.println("Il primo numero è il più grande. : " + numero1 + ".");
                }
            }
        }
        if (numero2 > numero1) {
            if (numero2 > numero3) {
                if (numero2 > numero4) {
                    System.out.println("Il secondo numero è il più grande: " + numero2 + ".");
                }
            }
        }
        if (numero3 > numero1) {
            if (numero3 > numero2) {
                if (numero3 > numero4) {
                    System.out.println("Il terzo numero è il più grande: " + numero3 + ".");
                }
            }
        }
        if (numero4 > numero1) {
            if (numero4 > numero2) {
                if (numero4 > numero3) {
                    System.out.println("Il quarto numero è il più grande: " + numero4 + ".");
                }
            }
        }
        // chiudo lo scanner
        scan.close();
    }
}