import java.util.Scanner;
import java.util.Locale;

public class e46_verificaEta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci il tuo nome: ");
        String nome = scan.nextLine();

        System.out.println("Inserisci la tua età: ");
        int eta = scan.nextInt();

        if (eta >= 18) {
            System.out.println("Benvenuto, " + nome + "! Sei maggiorenne.");
        } else {
            System.out.println("Ciao, " + nome + ", sei minorenne, ti mancano " + (18 - eta) + " anni per essere maggiorenne.");
        }
        scan.close();
    }
}
