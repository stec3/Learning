import java.util.Scanner;
import java.util.Locale;

public class e11_numeriUguali {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo il primo numero
        System.out.println("Inserire il primo numero: ");
        double numero1 = scan.nextDouble();

        // chiedo il secondo numero
        System.out.println("Inserire il secondo numero: ");
        double numero2 = scan.nextDouble();

        // verifico se i due numeri sono uguali
        if (numero1 == numero2) {
            System.out.print("I numeri inseriti sono uguali.");
        } else {
            System.out.println("I numeri inseriti sono diversi");
        }
        // chiudo lo scanner
        scan.close();
    }
}
