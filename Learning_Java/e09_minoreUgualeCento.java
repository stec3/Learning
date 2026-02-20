import java.util.Scanner;
import java.util.Locale;

public class e09_minoreUgualeCento {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore aritmetico internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo il numero da analizzare
        System.out.println("Inserisci il numero: ");
        int numero = scan.nextInt();

        // rilevo se il numero è maggiore o minore/uguale a 100
        if (numero >= 100) {
            System.out.println("Il numero è maggiore di 100");
        } else {
            System.out.println("Il numero è minore di/uguale a 100");
        }
    }
}