import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar
         de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: */

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual numero deseja saber a tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }
    }
}
