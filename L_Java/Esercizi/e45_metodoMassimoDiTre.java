import java.util.Scanner;
import java.util.Locale;

public class e45_metodoMassimoDiTre {

    public static int massimoDiTre(int a, int b, int c) {

        int massimo = a;

        if (b > massimo) {
            massimo = b;
        }

        if ( c> massimo) {
            massimo = c;
        }
        
        return massimo;

        }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] numeri = new int [3];
        System.out.println("Inserisci 3 numeri: ");

        for (int i = 0; i < numeri.length; i++) {

            System.out.println("Inserisci il " + (i + 1) + "° numero: ");
            numeri[i] = scan.nextInt();
        }

        int massimo = massimoDiTre(numeri[0], numeri[1], numeri[2]);
        System.out.println("Il numero più grande è: " + massimo);

        scan.close();
    }
}
