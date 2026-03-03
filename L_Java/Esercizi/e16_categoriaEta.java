import java.util.Scanner;
import java.util.Locale;

public class e16_categoriaEta {
    public static void main(String[] args) {

        // creo lo sacnner e imposto il separatore decimale universale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo l'età all'utente
        System.out.println("Inserire l'età: ");
        int eta = scan.nextInt();

        // inserisco l'età nella categoria giusta
        if (eta >= 0) {
            if (eta <= 12) {
                System.out.println("Categoria età: Bambino. (0-12)");
            }
        }
        if (eta >= 13) {
            if (eta <= 19) {
                System.out.println("Categoria età: Adolescente. (13-19)");
            }
        }
        if (eta >= 20) {
            if (eta <= 64) {
                System.out.println("Categoria età: Adulto. (20-64)");
            }
        }
        if (eta >= 65) {
            System.out.println("Categoria età: Anziano. (65+)");
        }
        // chiudo lo scanner
        scan.close();
    }
}
