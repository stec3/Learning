import java.util.Scanner;
import java.util.Locale;

public class e41_ricercaElemento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci 5 numeri: ");
        double[] numeri = new double[5];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = scan.nextDouble();
        }

        System.out.println("Inserisci il numero da cercare: ");
        double numeroDaCercare = scan.nextDouble();

        boolean trovato = false;

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] == numeroDaCercare) {
                System.out.println("Trovato! Posizione: " + i);
            trovato = true;
        break;
            }
        }

        if (!trovato) {
            System.out.println("Non trovato");
        }

        scan.close();
    }
}
