import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        /*Faça um Programa que leia um vetor de 8 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. */
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntconsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                 letra.equalsIgnoreCase("u"))) {
                 consoantes[count] = letra;
                 qntconsoantes++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");

        }
        System.out.println("Quantidade de concoantes: " + qntconsoantes);
        System.out.println(consoantes.length);

        }
    }


