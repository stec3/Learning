import java.util.Scanner;
import java.util.Locale;

public class e40_contaPariDispari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci 10 numeri: ");
        double[] numeri = new double[10];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = scan.nextDouble();
        }

        int pari = 0;
        int dispari = 0;

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] % 2 == 0) {
                pari++;
            } else {
                dispari++;
            }
        }   

        System.out.println("Pari: " + pari);
        System.out.println("Dispari: " + dispari);

        scan.close();
    }
}
