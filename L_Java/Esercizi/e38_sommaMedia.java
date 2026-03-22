import java.util.Scanner;
import java.util.Locale;

public class e38_sommaMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

       double[] numeri = new double[5];

       System.out.println("Inserisci 5 numeri: ");

       for (int i = 0; i < numeri.length; i++) {
              System.out.println("Numero " + (i + 1) + ": ");
              numeri[i] = scan.nextDouble();
        }

       double somma = 0;
       for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        double media = somma / numeri.length;

        System.out.println("La somma è: " + somma);
        System.out.println("La media è: " + media);

        scan.close();
    }
}
