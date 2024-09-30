package esercizio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("qunati km hai percorso?");
            int km = scanner.nextInt();

            System.out.println("qunati litri di carburante hai consumato?");
            int litri = scanner.nextInt();

            int kmLitro = km / litri;
            System.out.println("il tuo mezzo può fare " + kmLitro + " km per litro");
        } catch (ArithmeticException e) {
            System.out.println("Errore: impossibile che non hai consumato carburante.");
        } catch (Exception e) {
            System.out.println("Errore: inserisci un valore valido.");
        }
        scanner.close();
    }
}
