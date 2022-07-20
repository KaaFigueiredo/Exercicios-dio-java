import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /* Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares. */


        Scanner scan = new Scanner(System.in);

        //variavel
        int qntNumeros;
        int numero;
        int qntPares = 0, qntImpares = 0;


        System.out.println("Quantidade de numeros: ");
        qntNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            // Formula para verificar se o numero é par ou impar.
            if (numero % 2 == 0) qntPares++;
            else qntImpares++;

            //'++'  incremento.
            count ++;
            }while (count < qntNumeros);
        System.out.println("Quantidade de Par: " + qntPares);
        System.out.println("Quantidade de Imapar: " + qntImpares);
        }
}
