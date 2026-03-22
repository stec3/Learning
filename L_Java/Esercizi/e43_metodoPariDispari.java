import java.util.Scanner;
import java.util.Locale;

public class e43_metodoPariDispari {

    public static boolean ePari(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci un numero: ");
        int numero = scan.nextInt();

        if (ePari(numero)) {
            System.out.println("Pari.");
        } else {
            System.out.println("Dispari.");
        }

        scan.close();
    }
}
