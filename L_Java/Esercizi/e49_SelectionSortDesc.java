import java.util.Scanner;
import java.util.Locale;

public class e49_SelectionSortDesc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] numeri = new int[10];

        // Creo una variabile per contare il numero di scambi effettuati
        int contaScambi = 0; 

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero: ");
            numeri[i] = scan.nextInt();
        }

        // Scorro l'array n-1 volte
        // Ad ogni giro fisso la posizione i
        for (int i = 0; i < numeri.length - 1; i++) {

            // Ipotizzo che il massimo sia in posizione i 
            int maxIndex = i;

            // Cerco nel resto dell'array (da i+1 in poi) se c'è un valore più grande
            for (int j = i + 1; j < numeri.length; j++ ) {
                if (numeri[j] > numeri[maxIndex]) {
                    maxIndex = j; // Trovato un nuovo massimo, aggiorno l'indice
                }
            }

            // Dopo aver scandito tutto il resto, scambio SOLO se serve
            if (maxIndex != i) {
                int temp = numeri[i];
                numeri[i] = numeri[maxIndex];
                numeri[maxIndex] = temp;
                contaScambi++;
            }
        }

        // Stampo l'array ordinato
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }
        System.out.println("Numero di scambi effettuati: " + contaScambi);

        scan.close();
    }
}
