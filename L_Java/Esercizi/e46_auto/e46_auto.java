package e46_auto;

public class e46_auto {
    public static void main(String[] args) {
    
    Auto a1 = new Auto("Fiat", "Panda", 2018);
    Auto a2 = new Auto("Ferrari", "488", 2020);
    Auto a3 = new Auto("Lamborghini", "Huracan", 2021);
        
    System.out.println("Marca auto 2: " + a2.getMarca() + ", marca auto 3: " + a3.getMarca());
    }
}
