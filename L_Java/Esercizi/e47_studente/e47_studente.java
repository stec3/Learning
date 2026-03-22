package e47_studente;

public class e47_studente {
    public static void main(String[] args) {

        double[] voti1 = {23, 25,22, 27, 29};
        double[] voti2 = {18, 20, 18, 21, 19};

        studente s1 = new studente("Mario", "Rossi", voti1);
        studente s2 = new studente("Luigi", "Bianchi", voti2);

        System.out.println("La media dei voti di " + s1.getNome() + " " + s1.getCognome() + " è: " + s1.getMedia());
        System.out.println("La media dei voti di " + s2.getNome() + " " + s2.getCognome() + " è: " + s2.getMedia());
    
    }
}
