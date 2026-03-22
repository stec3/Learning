import java.util.Scanner;
import java.util.Locale;

public class e44_metodoMediaArray {

    public static double calcolaMedia(int[] numeri) {
        
        double somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        return somma / numeri.length;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] voti = new int [5];
        System.out.println("Inserisci 5 voti.");
        for (int i = 0; i < voti.length; i++) {
            System.out.println("Voto " + (i + 1) + ": ");
            voti[i] = scan.nextInt();
        }

        double media = calcolaMedia(voti);
        System.out.println("La media è: " + media);

        scan.close();
    }
}
