public class A18_oop {
    public static void main(String[] args) {

        // creo un oggetto Persona usando il costruttore
        persona p1 = new persona("Stefano", 22);
        persona p2 = new persona("Mario", 30);

        // uso i metodi dell'oggetto
        p1.saluta();
        p2.saluta();

        // leggo un attributo con il getter
        System.out.println("Il nome di p1 è: " + p1.getNome());
        System.out.println("L'età di p2 è: " + p2.getEta());

        // modifico un attributo con il setter
        p1.setEta(23);
        System.out.println("Stefano ora ha " + p1.getEta() + " anni.");

        // non posso fare p1.nome direttamente perché è private
        // devo usare getNome() e setNome()
    }
}
