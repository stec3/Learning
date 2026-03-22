import java.util.Scanner;
import java.util.Locale;

public class e36_mediaVoti {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double somma = 0;
        int contatore = 0;
        double voto = 0;

        System.out.println("Inserisci un voto (-1 per terminare): ");
        voto = scan.nextDouble();

        while (voto != -1) {
            somma += voto;
            contatore++;
            System.out.println("Inserisci un voto (-1 per terminare): ");
            voto = scan.nextDouble();
        }

        System.out.println("La media è: " + (somma / contatore));
    }    
}
