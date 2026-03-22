import java.util.Scanner;
import java.util.Locale;

public class e42_metodosomma {

    public static double somma(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci il primo numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        double num2 = scan.nextDouble();

        double risultato = somma(num1, num2);
        System.out.println("La somma è: " + risultato);

        scan.close();
    }
}
