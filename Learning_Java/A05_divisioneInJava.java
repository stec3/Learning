public class A05_divisioneInJava {
    public static void main(String [] args) {

        int d = 10 / 3;
        // stampa 3, perchè divide due interi

        double risultato = 10 / 3;
        // stampa 3.0, perchè prima viene fatto il risultato tra interi ( 3 e 10)
        // poi viene convertito il 3 in double diventando 3.0

        double x = 10;
        double y = 3;
        double z = x / y;
        System.out.println(z);
        // 3.3333..

        double risultato1 = 10.0 / 3;
        // 3.3333..
        double riusltato2 = 10 / 3.0;
        // 3.3333..
        double risultato3 = (double) 10 / 3;
        // "(double) 10" converte il 10 in double, divetnado 10.0
        double risultato4 = 10 / (double) 3;
        // stesso caso di prima ma viene trasformato il 3 in 3.0

        // int f = 10.0 / 3;
        // da errore perchè il risultato sarebbe un numero con la virgola, essendoci il 10.0
        int f = (int) 10.0 / 3;
        // sto castando in modo esplicito perchè il risultato sarebbe un numero con la virgola che stavo assegnando ad int

    }
}