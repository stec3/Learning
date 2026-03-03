import java.util.Scanner;
import java.util.Locale;

public class e13_calcoloArea {
    public static void main(String[] args) {

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // spiego all'utente cosa sto calcolando
        System.out.println("Calcolo dell'area: ");

        // chiedo la base e l'altezza
        System.out.println("Inserire la base della figura.");
        double base = scan.nextDouble();

        System.out.println("Inserire l'altezza della figura.");
        double altezza = scan.nextDouble();

        // chiedo più informazioni sulla figura di cui calcolare l'area.
        System.out.println("Inserire valore 0 se si vuole calcolare l'area di un triangolo.");
        System.out.println("Inserire valore DIVERSO da 0 se si vuole calcolare l'area di un rettangolo.");
        double valore = scan.nextDouble();

        // inizio il calcolo dell'area in base alla scelta dell'utente
        if (valore == 0) {
            System.out.print("L'area del triangolo è: " + base * altezza / 2 + ".");
        } else {
            System.out.println("L'area del rettangolo è: " + base * altezza + ".");
        }
        // chiudo lo scaner
        scan.close();
    }
}
