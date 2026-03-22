import java.util.Scanner;
import java.util.Locale;

public class e39_massimoMinimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci 5 numeri: ");
        double[] numeri = new double[5];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = scan.nextDouble();
        }

        double massimo = numeri[0];
        double minimo = numeri[0];

        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }

        System.out.println("Massimo: " + massimo);
        System.out.println("Minimo: " + minimo);

        scan.close();
    }
}
