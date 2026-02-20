import java.util.Scanner;
import java.util.Locale;

public class e17_ordineCrescente {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale universale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire 3 numeri
        System.out.println("Inserire tre numeri.");
        System.out.println("Primo numero:");
        double numero1 = scan.nextDouble();
        System.out.println("Secondo numero:");
        double numero2 = scan.nextDouble();
        System.out.println("Terzo numero:");
        double numero3 = scan.nextDouble();

        // inizio il confronto
        if (numero1 < numero2) {
            if (numero1 < numero3) {
                System.out.println("I numeri sono stati inseriti in ordine crescente.");
            } else {
                System.out.println("I numeri NON sono stati inseriti in ordine crescente");
            }
        } else {
            System.out.println("I numeri NON sono stati inseriti in ordine crescente");
        }
    }
}