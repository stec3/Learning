import java.util.Scanner;
import java.util.Locale;

public class A10_elseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserire un numero: ");
        double numero = scan.nextDouble();

        if (numero < 100) {
            System.out.println("Il numero è minore di 100.");
        } else if (numero < 200) {
            System.out.println("Il numero è compreso tra 100 e 200");
        } else if (numero < 300) {
            System.out.println("Il numero è compreso tra 200 e 300");
        } else {
            System.out.println("Il numero è maggiore o uguale a 300");
        }
        scan.close();
    }
}
