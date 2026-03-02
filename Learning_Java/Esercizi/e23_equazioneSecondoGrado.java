import java.util.Scanner;
import java.util.Locale;

public class e23_equazioneSecondoGrado {
    public static void main(String[] args) {
        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente le tre variabili a, b e c
        System.out.println("Inserire le tre variabili.");
        System.out.println("Prima variabile (a): ");
        double a = scan.nextDouble();
        System.out.println("Seconda variabile (b): ");
        double b = scan.nextDouble();
        System.out.println("Terza variabile (c): ");
        double c = scan.nextDouble();

        // calcolo se l'equazione ha due soluzioni reali, una soluzione reale o nessuna soluzione reale
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("L'equazione ha due soluzioni reali.");
        } else if (delta == 0) {
            System.out.println("L'equazione ha una soluzione reale.");
        } else {
            System.out.println("L'equazione non ha soluzioni reali.");
        }
        // chiudo lo scanner
        scan.close();
    }
}
