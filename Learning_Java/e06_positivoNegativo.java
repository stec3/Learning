import java.util.Scanner;
import java.util.Locale;


public class e06_positivoNegativo {
    public static void main(String[] args) {

        // creo lo scanner e assegno il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo di inserire il numero
        System.out.println("Inserire il numero: ");
        double numero = scan.nextDouble();

        // dico che se il numero è maggiore di zero deve stampare "numero positivo"
        if (numero >= 0) {
            System.out.println("Il numero è positivo");

            // dico che se il numero è minore di zero deve stampare "numero negativo"
        } else {
            System.out.println("Il numero è negativo");
        }
    }
}
