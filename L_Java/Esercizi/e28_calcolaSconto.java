import java.util.Scanner;
import java.util.Locale;

public class e28_calcolaSconto {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire l'importo speso
        System.out.println("Inserire la spesa totale: ");
        double spesa = scan.nextDouble();

        // calcolo lo sconto in base all'importo speso
        if (spesa >= 200) {
            System.out.println("Sconto del 20%: " + (spesa * 0.2));
        } else if (spesa >= 100) {
            System.out.println("Sconto del 10% : " + (spesa * 0.1));
        } else {
            System.out.println("Nessuno sconto applicabile.");
        }
        // chiudo lo scanner
        scan.close();
    }
}
