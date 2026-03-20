import java.util.Scanner;
import java.util.Locale;

public class e27_classificazioneEta {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale universale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente l'età da classificare
        System.out.println("Inserie l'età: ");
        int eta = scan.nextInt();

        // classifico l'età
        if (eta >= 0 && eta <= 12) {
            System.out.println("Bambino");
        } else if (eta >= 13 && eta <= 19) {
            System.out.println("Adolescente");
        } else if (eta >= 20 && eta <= 59) {
            System.out.println("Adulto");
        } else if (eta >= 60) {
            System.out.println("Anziano");
        }
        // chiudo lo scanner
        scan.close();
    }
}
