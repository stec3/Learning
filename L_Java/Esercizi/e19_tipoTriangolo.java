import java.util.Scanner;
import java.util.Locale;

public class e19_tipoTriangolo {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente la lunghezza degli angoli del triangolo
        System.out.println("Inserire la lunghezza dei tre angoli:");

        System.out.println("Lunghezza primo angolo:");
        double angolo1 = scan.nextDouble();

        System.out.println("Lunghezza secondo angolo:");
        double angolo2 = scan.nextDouble();

        System.out.println("Lunghezza terzo angolo:");
        double angolo3 = scan.nextDouble();

        // inizio il confronto per determinare il tipo di triqangolo
        if (angolo1 == angolo2) {
            if (angolo1 == angolo3) {
                System.out.println("Il triangolo è Equilatero.");
            }
        }
        if (angolo1 == angolo2) {
            if (angolo1 != angolo3) {
                if (angolo1 != angolo2) {
                    if (angolo2 == angolo3) {
                        if (angolo2 != angolo1) {
                            System.out.println("Il triangolo è Isoscele.");
                        }
                    }
                }
            }
        }

        if (angolo1 != angolo2) {
            if (angolo1 != angolo3) {
                if (angolo2 != angolo3) {
                    System.out.println("Il triangolo è Scaleno.");
                }
            }
        }
        // chiudo lo scanner
        scan.close();
    }
}
