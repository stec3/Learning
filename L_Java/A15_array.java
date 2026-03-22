import java.util.Scanner;
import java.util.Locale;

public class A15_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // creo un array vuoto di 5 elementi (tutti inizializzati a 0)
        int[] numeri = new int[5];

        // posso anche creare un array con valori già dentro
        int[] voti = {10, 20, 30, 40, 50};

        // gli indici partono da 0, non da 1
        // voti[0] = 10, voti[1] = 20, voti[4] = 50
        // voti[5] = errore, fuori range
        System.out.println("Il primo voto è: " + voti[0]);
        System.out.println("L'ultimo voto è: " + voti[4]);

        // scorro l'array con un for
        // .length mi dà la lunghezza dell'array
        // uso < e non <= perché gli indici vanno da 0 a length-1
        System.out.println("Tutti i voti:");
        for (int i = 0; i < voti.length; i++) {
            System.out.println("Voto " + (i + 1) + ": " + voti[i]);
        }

        // riempio un array da tastiera
        System.out.println("Inserisci 5 numeri:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeri[i] = scan.nextInt();
        }

        // calcolo somma e media dell'array
        int somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        double media = (double) somma / numeri.length;
        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);

        // trovo il massimo dell'array
        int max = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        System.out.println("Il massimo è: " + max);

        scan.close();
    }
}
