package esercizio2;

import java.util.Scanner;

public class MainDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("qunati km hai percorso?");
            double  km = scanner.nextDouble();

            System.out.println("qunati litri di carburante hai consumato?");
            double  litri = scanner.nextDouble();

            double  kmLitro = km / litri;
            System.out.println("il tuo mezzo può fare " + kmLitro + " km per litro");
        } catch (ArithmeticException e) {
            System.out.println("Errore: impossibile che non hai consumato carburante.");
        } catch (Exception e) {
            System.out.println("Errore: inserisci un valore valido.");
        }
        scanner.close();
    }
}
