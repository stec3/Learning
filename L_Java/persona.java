// questa è la classe Persona, il "modello"
// gli attributi sono private, così nessuno li può modificare direttamente

public class persona {

    // attributi: le caratteristiche della persona
    private String nome;
    private int eta;

    // costruttore: serve per creare un oggetto Persona
    // quando scrivi new Persona("Stefano", 22), java chiama questo
    public persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // getter: serve per LEGGERE un attributo private
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    // setter: serve per MODIFICARE un attributo private
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // un metodo normale della classe
    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
    }
}
