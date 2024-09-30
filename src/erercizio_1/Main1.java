package erercizio_1;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public  static void main(String[] args){
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);

        int[] array= new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) +1;
        }

        System.out.println("array casuale");
        for (int num : array){
            System.out.println( num + " ");
        }

        while (true) {
            try {

                System.out.print("Inserisci un numero tra 1 e 10 (0 per terminare): ");
                int numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                }


                if (numero < 1 || numero > 10) {
                    System.out.println("Errore: il numero deve essere tra 1 e 10. Riprova.");
                } else {
                    System.out.print("Inserisci la posizione (0-4): ");
                    int posizione = scanner.nextInt();


                    if (posizione < 0 || posizione >= array.length) {
                        System.out.println("Errore: posizione non valida. Riprova.");
                    } else {

                        array[posizione] = numero;
                        System.out.println("Nuovo stato dell'array:");
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                }

            } catch (Exception e) {
                System.out.println("Errore: non hai inserito un numero.");
                scanner.next();
            }
        }
    }
}
