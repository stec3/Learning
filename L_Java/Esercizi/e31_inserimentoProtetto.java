import java.util.Scanner;
import java.util.Locale;

public class e31_inserimentoProtetto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double numero;
        do {
            System.out.println("Inserire un numero da 0 a 100: ");
            numero = scan.nextDouble();
            if (numero < 0 || numero > 100) {
            System.out.println("Il numero inserito non è valido, riprova.");
            }
        } while (numero < 0 || numero > 100);
        
        System.out.println("Il numero inserito è: " + numero);
    }
}
