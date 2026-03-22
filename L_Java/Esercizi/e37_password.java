import java.util.Scanner;
import java.util.Locale;

public class e37_password {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        String passwordCorretta = "java123";
        String passwordInserita;
        int contatore = 0;  

        do {
            System.out.println("Inserisci la password: ");
            passwordInserita = scan.nextLine();
            contatore++;

            if (!passwordInserita.equals(passwordCorretta) && contatore < 3) {
                System.out.println("Password errata. Tentativi rimasti: " + (3 - contatore));
            }
        } while (!passwordInserita.equals(passwordCorretta) && contatore < 3);

        if (passwordInserita.equals(passwordCorretta)) {
            System.out.println("Password corretta, accesso consentito!");
        } else {
            System.out.println("Numero massimo di tentativi raggiunto, accesso negato.");
        }
    }
}
