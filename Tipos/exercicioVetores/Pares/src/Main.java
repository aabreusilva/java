import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Fazer um programa que leia N números inteiros e armazene-os
        * em umm vetor. Em seguida, mostre na tela todos os números
        * pares, e também a quantidade de números pares.
        */
        Scanner input = new Scanner(System.in);

        int numeros;

        System.out.print("Informe quantos números você vai digitar: ");
        int [] vetor = new int[numeros = input.nextInt()];


        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Informe o %d° número: ", i + 1);
            vetor[i] = input.nextInt();

        }

        System.out.println("\nNúmeros pares: ");

        int quantidade = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                quantidade++;
            }

        }

        System.out.printf("\nQuantidade de números pares: %d", quantidade);

        input.close();
    }
}