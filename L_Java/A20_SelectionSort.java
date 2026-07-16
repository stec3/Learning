import java.util.Scanner;
import java.util.Locale;

public class A20_SelectionSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] numeri = new int[10];

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero: ");
            numeri[i] = scan.nextInt();
        }

        // Scorro l'array n-1 volte
        // Ad ogni giro fisso la posizione i
        for (int i = 0; i < numeri.length - 1; i++) {

            // Ipotizzo che il minimo sia in posizione i 
            int minIndex = i;

            // Cerco nel resto dell'array (da i+1 in poi) se c'è un valore più piccolo
            for (int j = i + 1; j < numeri.length; j++ ) {
                if (numeri[j] < numeri[minIndex]) {
                    minIndex = j; // Trovato un nuovo minimo, aggiorno l'indice
                }
            }

            // Dopo aver scandito tutto il resto, scambio SOLO se serve
            if (minIndex != i) {
                int temp = numeri[i];
                numeri[i] = numeri[minIndex];
                numeri[minIndex] = temp;
            }
        }

        // Stampo l'array ordinato
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        scan.close();
    }
}
