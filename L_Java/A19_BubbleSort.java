import java.util.Scanner;
import java.util.Locale;

public class A19_BubbleSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] numeri = new int[10];

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero: ");
            numeri[i] = scan.nextInt();
        }

        // Scorro l'arrar n-1 volte
        for (int i = 0; i < numeri.length - 1; i++) {

            // Ad ogni giro confronto coppire vicine
            for (int j = 0; j < numeri.length - 1 - i; j++) {

                if (numeri[j] > numeri[j+1]) {

                    // Scambio i due numeri
                    int temp = numeri[j];
                    numeri[j] = numeri[j + 1];
                    numeri[j + 1] = temp;
                }
            }
        }

        // Stampo l'array ordinato
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        // Chiudo lo scanner
        scan.close();
    }
}