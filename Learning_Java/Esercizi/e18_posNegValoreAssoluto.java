import java.util.Scanner;
import java.util.Locale;

public class e18_posNegValoreAssoluto {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire un numero
        System.out.println("Inserire il numero da analizzare:");
        double numero = scan.nextDouble();

        // inizio l'analizi
        if (numero >= 0) {
            System.out.println("Il numero è positivo. Valore assoluto = " + numero);
        } else {
            System.out.println("Il numero è negativo. Valore assoluto = " + numero * -1);
        }
        // chiudo lo scanner
        scan.close();
    }
}