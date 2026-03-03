public class A01_variabili {
    public static void main(String[] args) {

        // <tipo della variabile> <nome della variabile>
        int x;
        x = 10;

        // l'inizializzazione (assegnare il primo varole) della variabile può avenire
        // anche in una singola riga
        int y = 40;

        // il valore della variabile viene può essere cambiato e prende l'ultima assegnazione
        x = 20;
        x = 30;
        // la variabile prende sempre l'ultimo varole assegnato

        long w = 23L; // numeri interi più grandi che java possiede
        int f = 3; // -2miliardi +2miliardi circa
        short z = 3; // -32768 +32767 circa
        byte r = 3; // -128 +127

        float q = 14.3F; // numeri decimali
        double h = 14.34; // numeri decimali con elevata precisione

        char c = 'e'; // singolo carattere

        boolean u = true; // solo valori booleani (true-false)

    }

}