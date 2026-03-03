public class A02_operatoriAritmetici {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;

        int c = a + b;

        c = a + 20;

        c = c + 40;

        b = b + 50;

        b = b + a;

        a = a + 1;
        a++;
        // hanno stesso significato, aumenta il valore di a di uno

        // tutte queste diciture valgono per tutte le operazioni aritmetiche
        // + (come visto), - , * , /

        int r = 10 % 3;
        // operatore di resto (o operatore di modulo), restituiesce il resto della divisione tra i due valori

    }
}