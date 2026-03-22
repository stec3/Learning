package e47_studente;

public class studente {

    private String nome;
    private String cognome;
    private double[] voti;

    public studente(String nome, String cognome, double[] voti) {
        this.nome = nome;
        this.cognome = cognome;
        this.voti = voti;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getMedia() {

            double somma = 0;
            for (int i = 0; i < voti.length; i++) {
                somma += voti[i];
            }
        double media = somma / voti.length;
        return media;
    }
}

