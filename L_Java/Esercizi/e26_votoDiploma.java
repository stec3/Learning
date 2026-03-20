import java.util.Scanner;
import java.util.Locale;

public class e26_votoDiploma {
    public static void main(String[] args) {

         // creo lo scanner e imposto il separatore decimale internazionale
         Scanner scan = new Scanner(System.in);
         scan.useLocale(Locale.US);

         // chiedo all'utente di inserire la valutazione dell'esame di maturità
         System.out.println("Inserire la valutazione dell'esame: ");
         int voto = scan.nextInt();

         // determino il voto del diploma in base alla valutazione dell'esame
         if (voto >= 90) {
            System.out.println("Ottimo");
         } else if (voto >= 80) {
            System.out.println("Buono");
         } else if (voto >= 70) {
            System.out.println("Sufficiente");
         } else if (voto >= 60) {
            System.out.println("Insufficiente");
         } else {
            System.out.println("Bocciato");
         }
         // chiudo lo scanner
         scan.close();
    }    
}
