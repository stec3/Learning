import java.util.Scanner;
import java.util.Locale;

public class A12_doWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        int numero;
        do {
            System.out.println("Inserisci un numero positivo: ");
            numero = scan.nextInt();
        } while (numero <= 0);
    }
}