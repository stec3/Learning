import java.util.Scanner;
import java.util.Locale;

public class A17_metodi {

    // un metodo è un blocco di codice che fa una cosa specifica
    // lo scrivo una volta e lo richiamo quando voglio

    // metodo void: fa qualcosa ma non ritorna niente
    public static void saluta(String nome) {
        System.out.println("Ciao " + nome + "!");
    }

    // metodo con return: fa qualcosa e ritorna un valore
    public static int somma(int a, int b) {
        return a + b;
    }

    // posso ritornare qualsiasi tipo: int, double, String, boolean...
    public static double calcolaMedia(int a, int b) {
        return (double)(a + b) / 2;
    }

    // metodo con un array come parametro
    public static int trovaMassimo(int[] numeri) {
        int max = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        return max;
    }

    // metodo che ritorna un boolean
    public static boolean ePari(int numero) {
        return numero % 2 == 0;
    }

    // il main è il metodo principale, da qui parte il programma
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiamo il metodo void
        saluta("Stefano");

        // chiamo il metodo con return e salvo il risultato
        int risultato = somma(3, 5);
        System.out.println("3 + 5 = " + risultato);

        // posso anche stamparlo direttamente
        System.out.println("Media: " + calcolaMedia(10, 7));

        // uso il metodo con un array
        int[] voti = {18, 25, 30, 22, 28};
        System.out.println("Il voto massimo è: " + trovaMassimo(voti));

        // uso il metodo boolean
        System.out.println("Inserisci un numero: ");
        int numero = scan.nextInt();
        if (ePari(numero)) {
            System.out.println(numero + " è pari");
        } else {
            System.out.println(numero + " è dispari");
        }

        scan.close();
    }
}
