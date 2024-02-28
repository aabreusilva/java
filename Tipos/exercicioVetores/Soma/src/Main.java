import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        * -Imprimir todos os elementos do vetor;
        * -Mostrar na tela a soma dos elementos do vetor;
        */

        double soma = 0.0, media = 0.0;

        System.out.print("Quantos números você vai digitar? ");
        double [] vetor = new double[input.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %d° número: ", i + 1);
            vetor[i] = input.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i] / vetor.length;
        }

        System.out.print("Valores:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(" %.1f,", vetor[i]);
        }

        System.out.println();
        System.out.printf("Soma: %s%n", soma);
        System.out.printf("Média: %.2f%n", media);

        input.close();
    }
}