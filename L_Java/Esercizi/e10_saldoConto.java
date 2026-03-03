import java.util.Scanner;
import java.util.Locale;

public class e10_saldoConto {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo il saldo del conto
        System.out.println("Saldo attuale del conto corrente:");
        double saldo = scan.nextDouble();

        // verifico se è inferiore o superiore a 50
        if (saldo < 50) {
            System.out.println("Il tuo saldo è insufficiente");
        } else {
            System.out.println("Il tuo saldo è sufficiente");
        }

        // chiudo lo scanner
        scan.close();
    }
}
