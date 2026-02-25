public class e04_pesoPersona {
    public static void main (String[] args) {
         double persona1 = 80.78;
         double persona2 = 50.98;
         double persona3 = 102.96;

         System.out.println("Persona 1: " + persona1 + ", Persona 2: " + persona2 + ", Persona 3: " + persona3);

         // calcolo la media del peso tra le tre persone
         double media = (persona1 + persona2 + persona3) / 3;

         System.out.println("Peso medio tra 3 persone: " + media);

    }
}