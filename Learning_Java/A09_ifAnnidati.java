import java.util.Scanner;
import java.util.Locale;

public class A09_ifAnnidati {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci un numero: ");
        double numero1 = scan.nextDouble();

        if (numero1 > 10) {
            if (numero1 < 30)
                System.out.println("Numero 1.");
            else
                System.out.println("Numero 2.");
        } else {
            System.out.println("Numero 3.");
        }
    }
}