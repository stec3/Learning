import java.util.Scanner;
import java.util.Locale;

public class e29_contoRovescia {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         scan.useLocale(Locale.US);

        // chiedo all'utente di inserire un numero intero
        System.out.println("Inserire un numero intero: ");
        int numero = scan.nextInt();

        // conto alla rovescia da numero a 0
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }
}
