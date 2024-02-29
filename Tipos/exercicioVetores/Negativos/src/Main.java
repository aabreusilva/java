import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um programa que leia um número inteiro positivo N (máximo = 10)
        * e depois N números inteiros e armazene-os em um vetor. Em seguida,
        * mostrar na tela todos os números negativos lidos.
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantos números deseja digitar: ");
        int [] vetor = new int[input.nextInt()];

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Informe o %d° número: ", i + 1);
            vetor[i] = input.nextInt();

        }

        System.out.println();

        System.out.println("Números negativos: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {

                System.out.printf("%d%n", vetor[i]);

            }

        }

        input.close();
    }
}