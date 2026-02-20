import java.util.Scanner;
import java.util.Locale;

public class e15_numeroMaggiore_Annidati {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente tre numeri da confrontare
        System.out.println("Inserisci tre numeri diversi l'uno dall'altro.");
        System.out.println("Inserisci il primo numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int numero2 = scan.nextInt();
        System.out.println("Inserisci il terzo numero: ");
        int numero3 = scan.nextInt();

        // inizio il confronto
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("Il primo numero inserito è il più grande: " + numero1);
            }
        }
        if (numero2 > numero1) {
            if (numero2 > numero3) {
                System.out.println("Il secondo numero inserito è il più grande: " + numero2);
            }
        }
        if (numero3 > numero1) {
            if (numero3 > numero2) {
                System.out.println("il terzo numero inserito è il più grande: " + numero3);
            }
        }
        // chiudo lo scanner
        scan.close();
    }
}