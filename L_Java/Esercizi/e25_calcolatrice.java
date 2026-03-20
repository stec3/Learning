import java.util.Scanner;
import java.util.Locale;

public class e25_calcolatrice {
    public static void main(String[] args) {
        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire due numeri e un operatore
        System.out.println("Inserire il primo numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Inserire il secondo numero: ");
        double num2 = scan.nextDouble();

        System.out.println("Inserire l'operazione da eseguire (+ per addizione, - per sottrazione, * per moltiplicazione, / per divisione): ");
        String operazione = scan.next();

        // eseguo l'operazione con le richieste dell'utente
        switch (operazione) {
            case "+":
                System.out.println("Il risultato è: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Il risultato è: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Il risultato è: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Il risultato è: " + (num1 / num2));
                } else {
                    System.out.println("Errore: divisione per zero non consentita.");
                }
                break;

        }
        // chiudo lo scanner
        scan.close();
    }
}