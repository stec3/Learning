import java.util.Scanner;
import java.util.Locale;

public class e32_tabelline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire un numero
        System.out.println("Inserisci un numero: ");
        int numero = scan.nextInt();

        // stampo la tabellina da 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scan.close();
    }
}
