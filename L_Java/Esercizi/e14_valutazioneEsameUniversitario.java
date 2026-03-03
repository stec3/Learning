import java.util.Scanner;
import java.util.Locale;

public class e14_valutazioneEsameUniversitario {
    public static void main(String[] args){

        // creo lo scanner e imposto il separatore decimale internazionale
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo all'utente di inserire i tre valori
        System.out.println("Inserire il voto dell'esame (da 0 a 30):");
        int voto = scan.nextInt();

        // "pulisco" l'input dell'invio dato in precedenza
        scan.nextLine();

        System.out.println("Tutti gli esercizi assegnati sono stati svolti? Digitare si/no.");
        String esercizi = scan.nextLine();

        System.out.println("Tutte le lezioni del corso sono state seguite? Digitare si/no.");
        String lezioni = scan.nextLine();

        // inizio il calcolo del punteggio
        if (esercizi.equals("si")&&(lezioni.equals("si"))) {
            voto = voto + 2;
        } else if (esercizi.equals("si")||(lezioni.equals("si"))) {
            voto = voto + 1;
        }
        // limite massimo
        if (voto > 30) {
            voto = 30;
        }
        // verifica superamento esame
        if (voto >= 18) {
            System.out.println("Esame superato! Voto: " + voto);
        } else {
            System.out.println("Esame non superato! Voto: " + voto);
        }
        // chiudo lo scanner
        scan.close();
    }
}