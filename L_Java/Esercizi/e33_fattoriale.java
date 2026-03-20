import java.util.Scanner;
import java.util.Locale;

public class e33_fattoriale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire un numero
        System.out.println("Inserisci un numero: ");
        int numero = scan.nextInt();

        // calcolo il fattoriale
        int fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;  // equivale a: fattoriale = fattoriale * i
        }

        System.out.println(numero + "! = " + fattoriale);

        scan.close();
    }
}
