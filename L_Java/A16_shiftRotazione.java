import java.util.Scanner;
import java.util.Locale;

public class A16_shiftRotazione {

    //shift a sinistra
    // sposto tutti gli elementi a sinistra 
    public static void shiftSinistra(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] temperature = {3, 4, 6, 8};

        for (int i = 0; i < temperature.length-1; i++) {
            temperature[i] = temperature[i + 1];
        }

        for (int i = 0; i < temperature.length; i++) {
            System.out.println(temperature[i]);
        }
    }

    // shift a destra
    // sposto tutti gli elementi a destra
    public static void shiftDestra(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] temperature = {3, 4, 6, 8};

        for (int i = temperature.length - 1; i > 0; i--) {
            temperature[i] = temperature[i - 1];
        }
    }

    // rotazione a sinistra
    // sposto tutti gli elementi a sinistra e il primo elemento diventa l'ultimo
    public static void rotazioneSinistra(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] temperature = {3, 4, 6, 8};

        int primoElemento = temperature[0];

        for (int i = 0; i < temperature.length - 1; i++) {
            temperature[i] = temperature[i + 1];
        }

        temperature[temperature.length - 1] = primoElemento;
    }

    // rotazione a destra
    // sposto tutti gli elementi a destra e l'ultimo elemento diventa il primo
    public static void rotazioneDestra(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); 

        int[] temperature = {3, 4, 6, 8};

        int ultimoElemento = temperature[temperature.length - 1];

        for (int i = temperature.length - 1; i > 0; i--) {
            temperature[i] = temperature[i - 1];
        }
        
        temperature[0] = ultimoElemento;
    }
}