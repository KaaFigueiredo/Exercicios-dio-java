import java.util.Random;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores. */
        Random random = new Random();

        int [] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }
        System.out.print("Numeros aleatorios: ");
        for ( int numero : numAleatorios ) {
            System.out.print(numero + " ");

        }
        System.out.print("Sucessores dos numeros aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero+1) + " ");

        }
    }
}
