import java.util.Scanner;
import java.util.Locale;

public class e35_numeriPari {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci un numero: ");
        int numero = scan.nextInt();

        System.out.println("I numeri pari da 0 a " + numero + " sono: ");
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
