public class Ex7 {
    public static void main(String[] args) {
        /*Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
         */

        int [] vetor = {0, 1, 5, -9, 10, -55};

        System.out.print("Vetor: ");
        int count = 0;
        while (count <= vetor.length -1) {
            System.out.print(vetor[count] + " ");
            count++;

        }
        System.out.print("\nVetor: ");

        for (int i = (vetor.length -1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
}
