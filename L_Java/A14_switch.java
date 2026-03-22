import java.util.Scanner;
import java.util.Locale;

public class A14_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // lo switch confronta una variabile con valori precisi
        // è come tanti if-else ma più pulito
        System.out.println("Inserisci un numero da 1 a 7: ");
        int giorno = scan.nextInt();

        switch (giorno) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                // default è come l'else, si attiva se nessun case corrisponde
                System.out.println("Giorno non valido");
                break;
        }

        // funziona anche con char e String
        System.out.println("Inserisci un operatore (+, -, *, /): ");
        char operatore = scan.next().charAt(0);

        switch (operatore) {
            case '+':
                System.out.println("Addizione");
                break;
            case '-':
                System.out.println("Sottrazione");
                break;
            case '*':
                System.out.println("Moltiplicazione");
                break;
            case '/':
                System.out.println("Divisione");
                break;
            default:
                System.out.println("Operatore non valido");
                break;
        }

        // break serve per uscire dallo switch dopo il caso giusto
        // se lo dimentichi, java esegue anche i case successivi (errore comune)

        // default non è obbligatorio ma è buona pratica metterlo sempre

        // lo switch funziona con int, char, String
        // non funziona con double

        scan.close();
    }
}
