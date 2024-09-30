package esercizio3;

import esercizio3.classi.ContoCorrente;
import esercizio3.classi.ContoOnLine;
import esercizio3.exception.BancaException;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente contoCorrente = new ContoCorrente("Mario Rossi", 0, 1000);
        ContoOnLine contoOnLine = new ContoOnLine("Luigi Bianchi", 0, 1000, 500);

        while (true){
            try {
                System.out.print("Inserisci l'importo da prelevare dal conto corrente (0 per terminare): ");
                double importo = scanner.nextDouble();
                if (importo == 0) break;
                contoCorrente.preleva(importo);
                System.out.println("Saldo conto corrente: " + contoCorrente.restituisciSaldo());
            } catch (BancaException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.print("Inserisci l'importo da prelevare dal conto online (0 per terminare): ");
                double importo = scanner.nextDouble();
                if (importo == 0) break;
                contoOnLine.preleva(importo);
                contoOnLine.stampaSaldo();
            } catch (BancaException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
