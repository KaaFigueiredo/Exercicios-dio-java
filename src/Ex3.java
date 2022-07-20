import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*  Faça um programa que leia 5 números e informe o maior número e a média desses números.*/
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;
        int media;

        int count = 0;
        do{
            System.out.println("Digite um Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            media = soma / 5;

            if (numero > maior) maior = numero;

            count = count + 1;

        } while(count < 5);
        System.out.println("Maior: " + maior );
        System.out.println("Soma : " + soma);
        System.out.println("Media: " + media);
    }
}
