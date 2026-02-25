import java.util.Scanner;
import java.util.Locale;

public class e08_temperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // chiedo la temperatura
        System.out.println("Inserire la temperatura rilevata: ");
        double temperatura = scan.nextDouble();

        // rilevo se è superiore o inferiore a 30 gradi centigradi
        if (temperatura > 30) {
            System.out.println("La temperatura è troppo alta");
        } else {
            System.out.println("La temperatura va bene");
        }
    }
}
