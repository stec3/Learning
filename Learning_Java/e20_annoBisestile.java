import java.util.Scanner;
import java.util.Locale;

public class e20_annoBisestile {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale universale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente l'anno da analizzare
        System.out.println("Inserire l'anno che si vuole analizzare:");
        int anno = scan.nextInt();

        // inizio l'analisi dell'anno
        if (anno % 4 == 0) {
            if (anno % 100 == 0 || anno % 400 == 0) {
                System.out.println("L'anno inserito è bisestile.");
            } else {
                System.out.println("L'anno inserito non è bisestile.");
            }
        }
    }
}
