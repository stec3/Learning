import java.util.Scanner;
import java.util.Locale;

public class A07_inputTastiera {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); // così se si vogliono i decimali con il punto, se con la virgola (Locale.ITALY)

        System.out.println("Inserisci un numero:");
        int r = scan.nextInt();

        System.out.println("Il numero inserito è: " + r);

        System.out.println("Inserisci un altro numero:");
        int s = scan.nextInt();

        System.out.println("Il secondo numero inserito è: " + s);
        // questo se si vogliono stampare numeri interi


        System.out.println("Inserisci peso attuale: ");
        double t = scan.nextDouble();

        System.out.println("Il peso è: " + t);

        System.out.println("Inserisci peso desiderato:");
        double u = scan.nextDouble();

        System.out.println("Il peso desiderato è: " + u);
        // questo se si vogliono stampare numeri decimali


        scan.nextLine();

        System.out.println("Cosa vuoi a colazione?");
        String a = scan.nextLine();

        System.out.println("A colazione voglio " + a);

        System.out.println("E a pranzo?");
        String w = scan.nextLine();

        System.out.println("A pranzo invece " + w);
        // questo se si vuole inserire del testo

    }

}
