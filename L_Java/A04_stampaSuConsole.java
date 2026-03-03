public class A04_stampaSuConsole {
    public static void main(String[] args) {

        System.out.println("prova1");
        System.out.print("prova2");
        // println manda il cursore (quindi la stampa successiva) nella riga dopo
        // print lascia il cursore nella riga in cui si trova

        int r = 10;
        System.out.println(r);
        System.out.println("Valore r = " + r);
        System.out.println("Valore r = " + r + "perchè ho deciso così");

        int s = 22;
        int t = 44;
        System.out.println("Il valore di s è " + s + ", la metà di " + t);

    }
}